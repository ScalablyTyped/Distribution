package typings.firebaseFirestore.distLitePackagesFirestoreTestUnitSpecsSpecTestRunnerMod

import typings.firebaseFirestore.distLitePackagesFirestoreSrcCoreTypesMod.TargetId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpecWatchEntity extends StObject {
  
  /** [<key>, <version>, <value>] */
  var doc: js.UndefOr[SpecDocument] = js.undefined
  
  /** [<key>, <version>, <value>][] */
  var docs: js.UndefOr[js.Array[SpecDocument]] = js.undefined
  
  var key: js.UndefOr[String] = js.undefined
  
  /** [<target-id>, ...] */
  var removedTargets: js.UndefOr[js.Array[TargetId]] = js.undefined
  
  /** [<target-id>, ...] */
  var targets: js.UndefOr[js.Array[TargetId]] = js.undefined
}
object SpecWatchEntity {
  
  inline def apply(): SpecWatchEntity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpecWatchEntity]
  }
  
  extension [Self <: SpecWatchEntity](x: Self) {
    
    inline def setDoc(value: SpecDocument): Self = StObject.set(x, "doc", value.asInstanceOf[js.Any])
    
    inline def setDocUndefined: Self = StObject.set(x, "doc", js.undefined)
    
    inline def setDocs(value: js.Array[SpecDocument]): Self = StObject.set(x, "docs", value.asInstanceOf[js.Any])
    
    inline def setDocsUndefined: Self = StObject.set(x, "docs", js.undefined)
    
    inline def setDocsVarargs(value: SpecDocument*): Self = StObject.set(x, "docs", js.Array(value*))
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setRemovedTargets(value: js.Array[TargetId]): Self = StObject.set(x, "removedTargets", value.asInstanceOf[js.Any])
    
    inline def setRemovedTargetsUndefined: Self = StObject.set(x, "removedTargets", js.undefined)
    
    inline def setRemovedTargetsVarargs(value: TargetId*): Self = StObject.set(x, "removedTargets", js.Array(value*))
    
    inline def setTargets(value: js.Array[TargetId]): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
    
    inline def setTargetsUndefined: Self = StObject.set(x, "targets", js.undefined)
    
    inline def setTargetsVarargs(value: TargetId*): Self = StObject.set(x, "targets", js.Array(value*))
  }
}
