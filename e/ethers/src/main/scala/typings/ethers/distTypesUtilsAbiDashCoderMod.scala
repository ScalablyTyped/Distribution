package typings.ethers

import typings.ethers.distTypesUtilsAbiDashCoderMod.AbiCoder
import typings.ethers.distTypesUtilsTypesMod.Arrayish
import typings.ethers.distTypesUtilsTypesMod.CoerceFunc
import typings.ethers.distTypesUtilsTypesMod.EventFragment
import typings.ethers.distTypesUtilsTypesMod.FunctionFragment
import typings.ethers.distTypesUtilsTypesMod.ParamType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethers/dist/types/utils/abi-coder", JSImport.Namespace)
@js.native
object distTypesUtilsAbiDashCoderMod extends js.Object {
  @js.native
  class AbiCoder () extends js.Object {
    def this(coerceFunc: CoerceFunc) = this()
    def coerceFunc(`type`: String, value: js.Any): js.Any = js.native
    def decode(types: js.Array[String | ParamType], data: Arrayish): js.Array[_] = js.native
    def encode(types: js.Array[String | ParamType], values: js.Array[_]): String = js.native
  }
  
  val defaultAbiCoder: AbiCoder = js.native
  val defaultCoerceFunc: CoerceFunc = js.native
  def formatParamType(paramType: ParamType): String = js.native
  def formatSignature(fragment: EventFragment): String = js.native
  def formatSignature(fragment: FunctionFragment): String = js.native
  def parseParamType(`type`: String): ParamType = js.native
  def parseSignature(fragment: String): EventFragment | FunctionFragment = js.native
}

