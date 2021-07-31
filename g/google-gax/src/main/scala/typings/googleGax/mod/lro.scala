package typings.googleGax.mod

import typings.googleGax.grpcMod.GrpcClientOptions
import typings.googleGax.operationsClientMod.OperationsClientBuilder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lro {
  
  @scala.inline
  def apply(options: GrpcClientOptions): OperationsClientBuilder = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[OperationsClientBuilder]
  
  @JSImport("google-gax", "lro")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("google-gax", "lro.ALL_SCOPES")
  @js.native
  def ALL_SCOPES: js.Array[String] = js.native
  @scala.inline
  def ALL_SCOPES_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ALL_SCOPES")(x.asInstanceOf[js.Any])
  
  @JSImport("google-gax", "lro.SERVICE_ADDRESS")
  @js.native
  def SERVICE_ADDRESS: String = js.native
  @scala.inline
  def SERVICE_ADDRESS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SERVICE_ADDRESS")(x.asInstanceOf[js.Any])
}
