package typings.egg.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("egg", "BaseContextClass")
@js.native
class BaseContextClass protected ()
  extends typings.eggCore.mod.BaseContextClass[Context, Application, EggAppConfig, IService] {
  def this(ctx: Context) = this()
  
  // tslint:disable-line
  /**
    * logger
    */
  var logger: EggLogger = js.native
}
