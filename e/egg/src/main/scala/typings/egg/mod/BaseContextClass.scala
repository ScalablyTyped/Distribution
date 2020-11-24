package typings.egg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("egg", "BaseContextClass")
@js.native
class BaseContextClass ()
  extends typings.eggCore.mod.BaseContextClass[Context, Application, EggAppConfig, IService] {
  
  // tslint:disable-line
  /**
    * logger
    */
  var logger: EggLogger = js.native
}
