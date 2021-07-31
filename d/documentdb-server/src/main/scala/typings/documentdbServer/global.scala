package typings.documentdbServer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("ErrorCodes")
  @js.native
  def ErrorCodes: IErrorCodes = js.native
  @scala.inline
  def ErrorCodes_=(x: IErrorCodes): Unit = js.Dynamic.global.updateDynamic("ErrorCodes")(x.asInstanceOf[js.Any])
  
  @JSGlobal("__")
  @js.native
  def __ : IObject = js.native
  @scala.inline
  def ___=(x: IObject): Unit = js.Dynamic.global.updateDynamic("__")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def getContext(): IContext = js.Dynamic.global.applyDynamic("getContext")().asInstanceOf[IContext]
}
