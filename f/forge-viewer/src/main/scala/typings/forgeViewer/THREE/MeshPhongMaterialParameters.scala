package typings.forgeViewer.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MeshPhongMaterialParameters
  extends StObject
     with MaterialParameters {
  
  var alphaMap: js.UndefOr[Texture] = js.undefined
  
  var aoMap: js.UndefOr[Texture] = js.undefined
  
  var aoMapIntensity: js.UndefOr[Double] = js.undefined
  
  var bumpMap: js.UndefOr[Texture] = js.undefined
  
  var bumpScale: js.UndefOr[Double] = js.undefined
  
  /** geometry color in hexadecimal. Default is 0xffffff. */
  var color: js.UndefOr[Double | String | Color] = js.undefined
  
  var combine: js.UndefOr[Combine] = js.undefined
  
  var displacementBias: js.UndefOr[Double] = js.undefined
  
  var displacementMap: js.UndefOr[Texture] = js.undefined
  
  var displacementScale: js.UndefOr[Double] = js.undefined
  
  var emissive: js.UndefOr[Double] = js.undefined
  
  var emissiveIntensity: js.UndefOr[Double] = js.undefined
  
  var emissiveMap: js.UndefOr[Texture] = js.undefined
  
  var envMap: js.UndefOr[Texture] = js.undefined
  
  var lightMap: js.UndefOr[Texture] = js.undefined
  
  var lightMapIntensity: js.UndefOr[Double] = js.undefined
  
  var map: js.UndefOr[Texture] = js.undefined
  
  var morphNormals: js.UndefOr[Boolean] = js.undefined
  
  var morphTargets: js.UndefOr[Boolean] = js.undefined
  
  var normalMap: js.UndefOr[Texture] = js.undefined
  
  var normalScale: js.UndefOr[Vector2] = js.undefined
  
  var reflectivity: js.UndefOr[Double] = js.undefined
  
  var refractionRatio: js.UndefOr[Double] = js.undefined
  
  var shininess: js.UndefOr[Double] = js.undefined
  
  var skinning: js.UndefOr[Boolean] = js.undefined
  
  var specular: js.UndefOr[Double] = js.undefined
  
  var specularMap: js.UndefOr[Texture] = js.undefined
  
  var wireframe: js.UndefOr[Boolean] = js.undefined
  
  var wireframeLinecap: js.UndefOr[String] = js.undefined
  
  var wireframeLinejoin: js.UndefOr[String] = js.undefined
  
  var wireframeLinewidth: js.UndefOr[Double] = js.undefined
}
object MeshPhongMaterialParameters {
  
  inline def apply(): MeshPhongMaterialParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeshPhongMaterialParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MeshPhongMaterialParameters] (val x: Self) extends AnyVal {
    
    inline def setAlphaMap(value: Texture): Self = StObject.set(x, "alphaMap", value.asInstanceOf[js.Any])
    
    inline def setAlphaMapUndefined: Self = StObject.set(x, "alphaMap", js.undefined)
    
    inline def setAoMap(value: Texture): Self = StObject.set(x, "aoMap", value.asInstanceOf[js.Any])
    
    inline def setAoMapIntensity(value: Double): Self = StObject.set(x, "aoMapIntensity", value.asInstanceOf[js.Any])
    
    inline def setAoMapIntensityUndefined: Self = StObject.set(x, "aoMapIntensity", js.undefined)
    
    inline def setAoMapUndefined: Self = StObject.set(x, "aoMap", js.undefined)
    
    inline def setBumpMap(value: Texture): Self = StObject.set(x, "bumpMap", value.asInstanceOf[js.Any])
    
    inline def setBumpMapUndefined: Self = StObject.set(x, "bumpMap", js.undefined)
    
    inline def setBumpScale(value: Double): Self = StObject.set(x, "bumpScale", value.asInstanceOf[js.Any])
    
    inline def setBumpScaleUndefined: Self = StObject.set(x, "bumpScale", js.undefined)
    
    inline def setColor(value: Double | String | Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setCombine(value: Combine): Self = StObject.set(x, "combine", value.asInstanceOf[js.Any])
    
    inline def setCombineUndefined: Self = StObject.set(x, "combine", js.undefined)
    
    inline def setDisplacementBias(value: Double): Self = StObject.set(x, "displacementBias", value.asInstanceOf[js.Any])
    
    inline def setDisplacementBiasUndefined: Self = StObject.set(x, "displacementBias", js.undefined)
    
    inline def setDisplacementMap(value: Texture): Self = StObject.set(x, "displacementMap", value.asInstanceOf[js.Any])
    
    inline def setDisplacementMapUndefined: Self = StObject.set(x, "displacementMap", js.undefined)
    
    inline def setDisplacementScale(value: Double): Self = StObject.set(x, "displacementScale", value.asInstanceOf[js.Any])
    
    inline def setDisplacementScaleUndefined: Self = StObject.set(x, "displacementScale", js.undefined)
    
    inline def setEmissive(value: Double): Self = StObject.set(x, "emissive", value.asInstanceOf[js.Any])
    
    inline def setEmissiveIntensity(value: Double): Self = StObject.set(x, "emissiveIntensity", value.asInstanceOf[js.Any])
    
    inline def setEmissiveIntensityUndefined: Self = StObject.set(x, "emissiveIntensity", js.undefined)
    
    inline def setEmissiveMap(value: Texture): Self = StObject.set(x, "emissiveMap", value.asInstanceOf[js.Any])
    
    inline def setEmissiveMapUndefined: Self = StObject.set(x, "emissiveMap", js.undefined)
    
    inline def setEmissiveUndefined: Self = StObject.set(x, "emissive", js.undefined)
    
    inline def setEnvMap(value: Texture): Self = StObject.set(x, "envMap", value.asInstanceOf[js.Any])
    
    inline def setEnvMapUndefined: Self = StObject.set(x, "envMap", js.undefined)
    
    inline def setLightMap(value: Texture): Self = StObject.set(x, "lightMap", value.asInstanceOf[js.Any])
    
    inline def setLightMapIntensity(value: Double): Self = StObject.set(x, "lightMapIntensity", value.asInstanceOf[js.Any])
    
    inline def setLightMapIntensityUndefined: Self = StObject.set(x, "lightMapIntensity", js.undefined)
    
    inline def setLightMapUndefined: Self = StObject.set(x, "lightMap", js.undefined)
    
    inline def setMap(value: Texture): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    
    inline def setMorphNormals(value: Boolean): Self = StObject.set(x, "morphNormals", value.asInstanceOf[js.Any])
    
    inline def setMorphNormalsUndefined: Self = StObject.set(x, "morphNormals", js.undefined)
    
    inline def setMorphTargets(value: Boolean): Self = StObject.set(x, "morphTargets", value.asInstanceOf[js.Any])
    
    inline def setMorphTargetsUndefined: Self = StObject.set(x, "morphTargets", js.undefined)
    
    inline def setNormalMap(value: Texture): Self = StObject.set(x, "normalMap", value.asInstanceOf[js.Any])
    
    inline def setNormalMapUndefined: Self = StObject.set(x, "normalMap", js.undefined)
    
    inline def setNormalScale(value: Vector2): Self = StObject.set(x, "normalScale", value.asInstanceOf[js.Any])
    
    inline def setNormalScaleUndefined: Self = StObject.set(x, "normalScale", js.undefined)
    
    inline def setReflectivity(value: Double): Self = StObject.set(x, "reflectivity", value.asInstanceOf[js.Any])
    
    inline def setReflectivityUndefined: Self = StObject.set(x, "reflectivity", js.undefined)
    
    inline def setRefractionRatio(value: Double): Self = StObject.set(x, "refractionRatio", value.asInstanceOf[js.Any])
    
    inline def setRefractionRatioUndefined: Self = StObject.set(x, "refractionRatio", js.undefined)
    
    inline def setShininess(value: Double): Self = StObject.set(x, "shininess", value.asInstanceOf[js.Any])
    
    inline def setShininessUndefined: Self = StObject.set(x, "shininess", js.undefined)
    
    inline def setSkinning(value: Boolean): Self = StObject.set(x, "skinning", value.asInstanceOf[js.Any])
    
    inline def setSkinningUndefined: Self = StObject.set(x, "skinning", js.undefined)
    
    inline def setSpecular(value: Double): Self = StObject.set(x, "specular", value.asInstanceOf[js.Any])
    
    inline def setSpecularMap(value: Texture): Self = StObject.set(x, "specularMap", value.asInstanceOf[js.Any])
    
    inline def setSpecularMapUndefined: Self = StObject.set(x, "specularMap", js.undefined)
    
    inline def setSpecularUndefined: Self = StObject.set(x, "specular", js.undefined)
    
    inline def setWireframe(value: Boolean): Self = StObject.set(x, "wireframe", value.asInstanceOf[js.Any])
    
    inline def setWireframeLinecap(value: String): Self = StObject.set(x, "wireframeLinecap", value.asInstanceOf[js.Any])
    
    inline def setWireframeLinecapUndefined: Self = StObject.set(x, "wireframeLinecap", js.undefined)
    
    inline def setWireframeLinejoin(value: String): Self = StObject.set(x, "wireframeLinejoin", value.asInstanceOf[js.Any])
    
    inline def setWireframeLinejoinUndefined: Self = StObject.set(x, "wireframeLinejoin", js.undefined)
    
    inline def setWireframeLinewidth(value: Double): Self = StObject.set(x, "wireframeLinewidth", value.asInstanceOf[js.Any])
    
    inline def setWireframeLinewidthUndefined: Self = StObject.set(x, "wireframeLinewidth", js.undefined)
    
    inline def setWireframeUndefined: Self = StObject.set(x, "wireframe", js.undefined)
  }
}
