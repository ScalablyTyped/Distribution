package typings.egg.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FastReady extends StObject {
  
  /**
    * don't wait all plugins ready, default is true.
    */
  var fastReady: Boolean
  
  /**
    * dirs don't need watch, including subdirectories, use relative path
    */
  var ignoreDirs: js.Array[String]
  
  /**
    * whether override default watchDirs, default is false.
    */
  var overrideDefault: Boolean
  
  /**
    * whether override default ignoreDirs, default is false.
    */
  var overrideIgnore: Boolean
  
  /**
    * whether reload on debug, default is true.
    */
  var reloadOnDebug: Boolean
  
  /**
    * whether to reload, use https://github.com/sindresorhus/multimatch
    */
  var reloadPattern: js.Array[String] | String
  
  /**
    * dirs needed watch, when files under these change, application will reload, use relative path
    */
  var watchDirs: js.Array[String]
}
object FastReady {
  
  inline def apply(
    fastReady: Boolean,
    ignoreDirs: js.Array[String],
    overrideDefault: Boolean,
    overrideIgnore: Boolean,
    reloadOnDebug: Boolean,
    reloadPattern: js.Array[String] | String,
    watchDirs: js.Array[String]
  ): FastReady = {
    val __obj = js.Dynamic.literal(fastReady = fastReady.asInstanceOf[js.Any], ignoreDirs = ignoreDirs.asInstanceOf[js.Any], overrideDefault = overrideDefault.asInstanceOf[js.Any], overrideIgnore = overrideIgnore.asInstanceOf[js.Any], reloadOnDebug = reloadOnDebug.asInstanceOf[js.Any], reloadPattern = reloadPattern.asInstanceOf[js.Any], watchDirs = watchDirs.asInstanceOf[js.Any])
    __obj.asInstanceOf[FastReady]
  }
  
  extension [Self <: FastReady](x: Self) {
    
    inline def setFastReady(value: Boolean): Self = StObject.set(x, "fastReady", value.asInstanceOf[js.Any])
    
    inline def setIgnoreDirs(value: js.Array[String]): Self = StObject.set(x, "ignoreDirs", value.asInstanceOf[js.Any])
    
    inline def setIgnoreDirsVarargs(value: String*): Self = StObject.set(x, "ignoreDirs", js.Array(value*))
    
    inline def setOverrideDefault(value: Boolean): Self = StObject.set(x, "overrideDefault", value.asInstanceOf[js.Any])
    
    inline def setOverrideIgnore(value: Boolean): Self = StObject.set(x, "overrideIgnore", value.asInstanceOf[js.Any])
    
    inline def setReloadOnDebug(value: Boolean): Self = StObject.set(x, "reloadOnDebug", value.asInstanceOf[js.Any])
    
    inline def setReloadPattern(value: js.Array[String] | String): Self = StObject.set(x, "reloadPattern", value.asInstanceOf[js.Any])
    
    inline def setReloadPatternVarargs(value: String*): Self = StObject.set(x, "reloadPattern", js.Array(value*))
    
    inline def setWatchDirs(value: js.Array[String]): Self = StObject.set(x, "watchDirs", value.asInstanceOf[js.Any])
    
    inline def setWatchDirsVarargs(value: String*): Self = StObject.set(x, "watchDirs", js.Array(value*))
  }
}
