package typings.expect.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RawMatcherFn extends js.Object {
  
  def apply(received: js.Any, expected: js.Any): ExpectationResult = js.native
  def apply(received: js.Any, expected: js.Any, options: js.Any): ExpectationResult = js.native
}
