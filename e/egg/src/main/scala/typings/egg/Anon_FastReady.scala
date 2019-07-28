package typings.egg

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FastReady extends js.Object {
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

object Anon_FastReady {
  @scala.inline
  def apply(
    fastReady: Boolean,
    ignoreDirs: js.Array[String],
    overrideDefault: Boolean,
    reloadOnDebug: Boolean,
    reloadPattern: js.Array[String] | String,
    watchDirs: js.Array[String]
  ): Anon_FastReady = {
    val __obj = js.Dynamic.literal(fastReady = fastReady, ignoreDirs = ignoreDirs, overrideDefault = overrideDefault, reloadOnDebug = reloadOnDebug, reloadPattern = reloadPattern.asInstanceOf[js.Any], watchDirs = watchDirs)
  
    __obj.asInstanceOf[Anon_FastReady]
  }
}

