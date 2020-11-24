package typings.ffiNapi.mod

import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.TopLevel
import typings.ffiNapi.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Callback
  extends Instantiable3[/* retType */ js.Any, /* argTypes */ js.Array[js.Any], /* fn */ js.Any, Buffer]
     with Instantiable4[
      /* retType */ js.Any, 
      /* argTypes */ js.Array[js.Any], 
      /* abi */ Double, 
      /* fn */ js.Any, 
      Buffer
    ] {
  
  def apply(retType: js.Any, argTypes: js.Array[_], abi: Double, fn: js.Any): Buffer = js.native
  def apply(retType: js.Any, argTypes: js.Array[_], fn: js.Any): Buffer = js.native
}
@JSImport("ffi-napi", "Callback")
@js.native
object Callback extends TopLevel[Callback]
