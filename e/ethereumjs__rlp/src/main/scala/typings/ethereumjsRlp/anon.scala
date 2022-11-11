package typings.ethereumjsRlp

import typings.ethereumjsRlp.ethereumjsRlpBooleans.`false`
import typings.ethereumjsRlp.ethereumjsRlpBooleans.`true`
import typings.ethereumjsRlp.mod.Decoded
import typings.ethereumjsRlp.mod.Input
import typings.ethereumjsRlp.mod.NestedUint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(input: Input): js.typedarray.Uint8Array | NestedUint8Array = js.native
    def apply(input: Input, stream: `false`): js.typedarray.Uint8Array | NestedUint8Array = js.native
    def apply(input: Input, stream: `true`): Decoded = js.native
  }
}
