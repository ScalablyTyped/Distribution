package typings.ejWebAll.ej

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MatrixTypes extends StObject
@JSGlobal("ej.MatrixTypes")
@js.native
object MatrixTypes extends StObject {
  
  @js.native
  sealed trait Identity extends MatrixTypes
  
  @js.native
  sealed trait Scaling extends MatrixTypes
  
  @js.native
  sealed trait Translation extends MatrixTypes
  
  @js.native
  sealed trait Unknown extends MatrixTypes
}
