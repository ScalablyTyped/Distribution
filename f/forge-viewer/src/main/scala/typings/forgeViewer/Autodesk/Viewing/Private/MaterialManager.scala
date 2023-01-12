package typings.forgeViewer.Autodesk.Viewing.Private

import typings.forgeViewer.Autodesk.Viewing.Model
import typings.forgeViewer.THREE.Material
import typings.forgeViewer.THREE.ShaderMaterial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaterialManager extends StObject {
  
  def addCompactLayoutSupport(material: Material): Material
  
  def addHDRMaterial(name: String, mat: ShaderMaterial): Unit
  
  def addInstancingSupport(material: Material): Material
  
  def addLineMaterial(name: String, mat: ShaderMaterial, modelId: Double): Unit
  
  def addMaterial(name: String, mat: Material, skipSimplePhongHeuristics: Boolean): Unit
  
  def addMaterialNonHDR(name: String, mat: ShaderMaterial): Unit
  
  def addNonHDRMaterial(name: String, mat: ShaderMaterial): Unit
  
  def addOverrideMaterial(name: String, mat: Material): Unit
  
  def cloneMaterial(mat: Material, model: Model): Material
  
  def getMaterialVariant(srcMaterial: Material, variant: MATERIAL_VARIANT, model: Model): Material
  
  def getModelMaterials(model: Model, includeOTG: Boolean): Any
  
  def removeMaterial(name: String): Unit
  
  def removeNonHDRMaterial(name: String): Unit
}
object MaterialManager {
  
  inline def apply(
    addCompactLayoutSupport: Material => Material,
    addHDRMaterial: (String, ShaderMaterial) => Unit,
    addInstancingSupport: Material => Material,
    addLineMaterial: (String, ShaderMaterial, Double) => Unit,
    addMaterial: (String, Material, Boolean) => Unit,
    addMaterialNonHDR: (String, ShaderMaterial) => Unit,
    addNonHDRMaterial: (String, ShaderMaterial) => Unit,
    addOverrideMaterial: (String, Material) => Unit,
    cloneMaterial: (Material, Model) => Material,
    getMaterialVariant: (Material, MATERIAL_VARIANT, Model) => Material,
    getModelMaterials: (Model, Boolean) => Any,
    removeMaterial: String => Unit,
    removeNonHDRMaterial: String => Unit
  ): MaterialManager = {
    val __obj = js.Dynamic.literal(addCompactLayoutSupport = js.Any.fromFunction1(addCompactLayoutSupport), addHDRMaterial = js.Any.fromFunction2(addHDRMaterial), addInstancingSupport = js.Any.fromFunction1(addInstancingSupport), addLineMaterial = js.Any.fromFunction3(addLineMaterial), addMaterial = js.Any.fromFunction3(addMaterial), addMaterialNonHDR = js.Any.fromFunction2(addMaterialNonHDR), addNonHDRMaterial = js.Any.fromFunction2(addNonHDRMaterial), addOverrideMaterial = js.Any.fromFunction2(addOverrideMaterial), cloneMaterial = js.Any.fromFunction2(cloneMaterial), getMaterialVariant = js.Any.fromFunction3(getMaterialVariant), getModelMaterials = js.Any.fromFunction2(getModelMaterials), removeMaterial = js.Any.fromFunction1(removeMaterial), removeNonHDRMaterial = js.Any.fromFunction1(removeNonHDRMaterial))
    __obj.asInstanceOf[MaterialManager]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MaterialManager] (val x: Self) extends AnyVal {
    
    inline def setAddCompactLayoutSupport(value: Material => Material): Self = StObject.set(x, "addCompactLayoutSupport", js.Any.fromFunction1(value))
    
    inline def setAddHDRMaterial(value: (String, ShaderMaterial) => Unit): Self = StObject.set(x, "addHDRMaterial", js.Any.fromFunction2(value))
    
    inline def setAddInstancingSupport(value: Material => Material): Self = StObject.set(x, "addInstancingSupport", js.Any.fromFunction1(value))
    
    inline def setAddLineMaterial(value: (String, ShaderMaterial, Double) => Unit): Self = StObject.set(x, "addLineMaterial", js.Any.fromFunction3(value))
    
    inline def setAddMaterial(value: (String, Material, Boolean) => Unit): Self = StObject.set(x, "addMaterial", js.Any.fromFunction3(value))
    
    inline def setAddMaterialNonHDR(value: (String, ShaderMaterial) => Unit): Self = StObject.set(x, "addMaterialNonHDR", js.Any.fromFunction2(value))
    
    inline def setAddNonHDRMaterial(value: (String, ShaderMaterial) => Unit): Self = StObject.set(x, "addNonHDRMaterial", js.Any.fromFunction2(value))
    
    inline def setAddOverrideMaterial(value: (String, Material) => Unit): Self = StObject.set(x, "addOverrideMaterial", js.Any.fromFunction2(value))
    
    inline def setCloneMaterial(value: (Material, Model) => Material): Self = StObject.set(x, "cloneMaterial", js.Any.fromFunction2(value))
    
    inline def setGetMaterialVariant(value: (Material, MATERIAL_VARIANT, Model) => Material): Self = StObject.set(x, "getMaterialVariant", js.Any.fromFunction3(value))
    
    inline def setGetModelMaterials(value: (Model, Boolean) => Any): Self = StObject.set(x, "getModelMaterials", js.Any.fromFunction2(value))
    
    inline def setRemoveMaterial(value: String => Unit): Self = StObject.set(x, "removeMaterial", js.Any.fromFunction1(value))
    
    inline def setRemoveNonHDRMaterial(value: String => Unit): Self = StObject.set(x, "removeNonHDRMaterial", js.Any.fromFunction1(value))
  }
}
