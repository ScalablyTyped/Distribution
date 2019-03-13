package typings
package eggLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FastReady extends js.Object {
  /**
    * don't wait all plugins ready, default is true.
    */
  var fastReady: scala.Boolean
  /**
    * dirs don't need watch, including subdirectories, use relative path
    */
  var ignoreDirs: js.Array[java.lang.String]
  /**
    * whether override default watchDirs, default is false.
    */
  var overrideDefault: scala.Boolean
  /**
    * whether reload on debug, default is true.
    */
  var reloadOnDebug: scala.Boolean
  /**
    * whether to reload, use https://github.com/sindresorhus/multimatch
    */
  var reloadPattern: js.Array[java.lang.String] | java.lang.String
  /**
    * dirs needed watch, when files under these change, application will reload, use relative path
    */
  var watchDirs: js.Array[java.lang.String]
}

object Anon_FastReady {
  @scala.inline
  def apply(
    fastReady: scala.Boolean,
    ignoreDirs: js.Array[java.lang.String],
    overrideDefault: scala.Boolean,
    reloadOnDebug: scala.Boolean,
    reloadPattern: js.Array[java.lang.String] | java.lang.String,
    watchDirs: js.Array[java.lang.String]
  ): Anon_FastReady = {
    val __obj = js.Dynamic.literal(fastReady = fastReady, ignoreDirs = ignoreDirs, overrideDefault = overrideDefault, reloadOnDebug = reloadOnDebug, reloadPattern = reloadPattern.asInstanceOf[js.Any], watchDirs = watchDirs)
  
    __obj.asInstanceOf[Anon_FastReady]
  }
}

