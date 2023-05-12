package typings.ethers.mod.ethers

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers", "ethers.FetchResponse")
@js.native
open class FetchResponse protected ()
  extends typings.ethers.typesEthersMod.FetchResponse {
  def this(statusCode: Double, statusMessage: String, headers: Record[String, String]) = this()
  def this(
    statusCode: Double,
    statusMessage: String,
    headers: Record[String, String],
    body: js.typedarray.Uint8Array
  ) = this()
  def this(
    statusCode: Double,
    statusMessage: String,
    headers: Record[String, String],
    body: js.typedarray.Uint8Array,
    request: typings.ethers.typesUtilsFetchMod.FetchRequest
  ) = this()
  def this(
    statusCode: Double,
    statusMessage: String,
    headers: Record[String, String],
    body: Null,
    request: typings.ethers.typesUtilsFetchMod.FetchRequest
  ) = this()
}
