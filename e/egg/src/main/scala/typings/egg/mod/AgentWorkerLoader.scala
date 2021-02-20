package typings.egg.mod

import typings.eggCore.mod.EggCore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("egg", "AgentWorkerLoader")
@js.native
class AgentWorkerLoader protected ()
  extends typings.eggCore.mod.EggLoader[
      EggCore[typings.eggCore.mod.PlainObject[js.Any]], 
      js.Any, 
      typings.eggCore.mod.EggLoaderOptions
    ] {
  /**
    * @constructor
    * @param {Object} options - options
    * @param {String} options.baseDir - the directory of application
    * @param {EggCore} options.app - Application instance
    * @param {Logger} options.logger - logger
    * @param {Object} [options.plugins] - custom plugins
    * @since 1.0.0
    */
  def this(options: typings.eggCore.mod.EggLoaderOptions) = this()
  
  def load(): Unit = js.native
}
