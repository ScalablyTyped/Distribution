package typings.ethereumjsUtil

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  type AddressLike = typings.ethereumjsUtil.addressMod.Address | typings.node.Buffer | java.lang.String
  
  type BNLike = typings.bnJs.mod.^  | java.lang.String | scala.Double
  
  type BufferLike = typings.node.Buffer | typings.std.Uint8Array | js.Array[scala.Double] | scala.Double | typings.bnJs.mod.^  | typings.ethereumjsUtil.typesMod.TransformableToBuffer | typings.ethereumjsUtil.typesMod.PrefixedHexString
  
  type PrefixedHexString = java.lang.String
}
