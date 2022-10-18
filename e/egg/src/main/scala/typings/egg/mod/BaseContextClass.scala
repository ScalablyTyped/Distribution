package typings.egg.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("egg", "BaseContextClass")
@js.native
open class BaseContextClass protected ()
  extends typings.eggCore.mod.BaseContextClass[Context[Any], Application, EggAppConfig, IService] {
  def this(ctx: Context[Any]) = this()
  
  // tslint:disable-line
  /**
    * logger
    */
  /* protected */ var logger: EggLogger = js.native
}
