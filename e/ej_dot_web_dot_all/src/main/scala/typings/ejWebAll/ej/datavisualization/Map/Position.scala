package typings.ejWebAll.ej.datavisualization.Map

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Position extends js.Object
@JSGlobal("ej.datavisualization.Map.Position")
@js.native
object Position extends js.Object {
  
  //specifies the bottomcenter position
  @js.native
  sealed trait Bottomcenter extends Position
  
  //specifies the bottomleft position
  @js.native
  sealed trait Bottomleft extends Position
  
  //specifies the bottomright position
  @js.native
  sealed trait Bottomright extends Position
  
  //specifies the center position
  @js.native
  sealed trait Center extends Position
  
  //specifies the centerleft position
  @js.native
  sealed trait Centerleft extends Position
  
  //specifies the centerright position
  @js.native
  sealed trait Centerright extends Position
  
  //specifies the none position
  @js.native
  sealed trait None extends Position
  
  //specifies the topcenter position
  @js.native
  sealed trait Topcenter extends Position
  
  //specifies the topleft position
  @js.native
  sealed trait Topleft extends Position
  
  //specifies the topright position
  @js.native
  sealed trait Topright extends Position
}
