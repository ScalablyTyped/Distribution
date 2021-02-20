package typings.ethereumjsUtil

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpersMod {
  
  @JSImport("ethereumjs-util/dist/helpers", "assertIsArray")
  @js.native
  def assertIsArray(input: js.Array[Double]): Unit = js.native
  
  @JSImport("ethereumjs-util/dist/helpers", "assertIsBuffer")
  @js.native
  def assertIsBuffer(input: Buffer): Unit = js.native
  
  @JSImport("ethereumjs-util/dist/helpers", "assertIsHexString")
  @js.native
  def assertIsHexString(input: String): Unit = js.native
  
  @JSImport("ethereumjs-util/dist/helpers", "assertIsString")
  @js.native
  def assertIsString(input: String): Unit = js.native
}
