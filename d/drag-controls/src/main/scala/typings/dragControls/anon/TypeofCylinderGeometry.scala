package typings.dragControls.anon

import org.scalablytyped.runtime.Instantiable8
import typings.three.mod.CylinderGeometry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofCylinderGeometry
  extends StObject
     with Instantiable8[
      /* radiusTop */ js.UndefOr[Double], 
      /* radiusBottom */ js.UndefOr[Double], 
      /* height */ js.UndefOr[Double], 
      /* radialSegments */ js.UndefOr[Double], 
      /* heightSegments */ js.UndefOr[Double], 
      /* openEnded */ js.UndefOr[Boolean], 
      /* thetaStart */ js.UndefOr[Double], 
      /* thetaLength */ js.UndefOr[Double], 
      CylinderGeometry
    ] {
  
  def fromJSON(data: Any): typings.three.cylinderGeometryMod.CylinderGeometry = js.native
}
