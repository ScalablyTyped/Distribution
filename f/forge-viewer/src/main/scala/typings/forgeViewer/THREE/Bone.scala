package typings.forgeViewer.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bone
  extends StObject
     with Object3D {
  
  def copy(source: Bone): Bone = js.native
  
  var skin: SkinnedMesh = js.native
}
