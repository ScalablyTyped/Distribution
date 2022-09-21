package typings.exaroton.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ResponseType extends StObject
// Internal types
@JSImport("exaroton", "ResponseType")
@js.native
object ResponseType extends StObject {
  
  @js.native
  sealed trait Buffer
    extends StObject
       with ResponseType
  
  @js.native
  sealed trait JSON
    extends StObject
       with ResponseType
  
  @js.native
  sealed trait Text
    extends StObject
       with ResponseType
}
