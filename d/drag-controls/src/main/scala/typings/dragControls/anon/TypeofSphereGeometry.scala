package typings.dragControls.anon

import org.scalablytyped.runtime.Instantiable7
import typings.three.mod.SphereGeometry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofSphereGeometry
  extends StObject
     with Instantiable7[
      /* radius */ js.UndefOr[Double], 
      /* widthSegments */ js.UndefOr[Double], 
      /* heightSegments */ js.UndefOr[Double], 
      /* phiStart */ js.UndefOr[Double], 
      /* phiLength */ js.UndefOr[Double], 
      /* thetaStart */ js.UndefOr[Double], 
      /* thetaLength */ js.UndefOr[Double], 
      SphereGeometry
    ] {
  
  def fromJSON(data: Any): typings.three.srcGeometriesSphereGeometryMod.SphereGeometry = js.native
}
