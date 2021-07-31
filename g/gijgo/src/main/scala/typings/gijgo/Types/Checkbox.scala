package typings.gijgo.Types

import typings.gijgo.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Checkbox
  extends StObject
     with JQuery {
  
  def destroy(): Unit = js.native
  
  //toggle(): Checkbox;
  def state(value: String): String | Checkbox = js.native
}
