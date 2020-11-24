package typings.egg.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FastReady extends js.Object {
  
  /**
    * don't wait all plugins ready, default is true.
    */
  var fastReady: Boolean = js.native
  
  /**
    * dirs don't need watch, including subdirectories, use relative path
    */
  var ignoreDirs: js.Array[String] = js.native
  
  /**
    * whether override default watchDirs, default is false.
    */
  var overrideDefault: Boolean = js.native
  
  /**
    * whether reload on debug, default is true.
    */
  var reloadOnDebug: Boolean = js.native
  
  /**
    * whether to reload, use https://github.com/sindresorhus/multimatch
    */
  var reloadPattern: js.Array[String] | String = js.native
  
  /**
    * dirs needed watch, when files under these change, application will reload, use relative path
    */
  var watchDirs: js.Array[String] = js.native
}
object FastReady {
  
  @scala.inline
  def apply(
    fastReady: Boolean,
    ignoreDirs: js.Array[String],
    overrideDefault: Boolean,
    reloadOnDebug: Boolean,
    reloadPattern: js.Array[String] | String,
    watchDirs: js.Array[String]
  ): FastReady = {
    val __obj = js.Dynamic.literal(fastReady = fastReady.asInstanceOf[js.Any], ignoreDirs = ignoreDirs.asInstanceOf[js.Any], overrideDefault = overrideDefault.asInstanceOf[js.Any], reloadOnDebug = reloadOnDebug.asInstanceOf[js.Any], reloadPattern = reloadPattern.asInstanceOf[js.Any], watchDirs = watchDirs.asInstanceOf[js.Any])
    __obj.asInstanceOf[FastReady]
  }
  
  @scala.inline
  implicit class FastReadyOps[Self <: FastReady] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFastReady(value: Boolean): Self = this.set("fastReady", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreDirsVarargs(value: String*): Self = this.set("ignoreDirs", js.Array(value :_*))
    
    @scala.inline
    def setIgnoreDirs(value: js.Array[String]): Self = this.set("ignoreDirs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverrideDefault(value: Boolean): Self = this.set("overrideDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReloadOnDebug(value: Boolean): Self = this.set("reloadOnDebug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReloadPatternVarargs(value: String*): Self = this.set("reloadPattern", js.Array(value :_*))
    
    @scala.inline
    def setReloadPattern(value: js.Array[String] | String): Self = this.set("reloadPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWatchDirsVarargs(value: String*): Self = this.set("watchDirs", js.Array(value :_*))
    
    @scala.inline
    def setWatchDirs(value: js.Array[String]): Self = this.set("watchDirs", value.asInstanceOf[js.Any])
  }
}
