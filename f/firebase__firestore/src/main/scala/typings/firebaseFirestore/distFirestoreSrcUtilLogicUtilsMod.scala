package typings.firebaseFirestore

import typings.firebaseFirestore.distFirestoreSrcCoreFilterMod.CompositeFilter
import typings.firebaseFirestore.distFirestoreSrcCoreFilterMod.Filter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFirestoreSrcUtilLogicUtilsMod {
  
  @JSImport("@firebase/firestore/dist/firestore/src/util/logic_utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def applyAssociation(filter: Filter): Filter = ^.asInstanceOf[js.Dynamic].applyDynamic("applyAssociation")(filter.asInstanceOf[js.Any]).asInstanceOf[Filter]
  
  inline def applyDistribution(lhs: Filter, rhs: Filter): Filter = (^.asInstanceOf[js.Dynamic].applyDynamic("applyDistribution")(lhs.asInstanceOf[js.Any], rhs.asInstanceOf[js.Any])).asInstanceOf[Filter]
  
  inline def computeDistributedNormalForm(filter: Filter): Filter = ^.asInstanceOf[js.Dynamic].applyDynamic("computeDistributedNormalForm")(filter.asInstanceOf[js.Any]).asInstanceOf[Filter]
  
  inline def computeInExpansion(filter: Filter): Filter = ^.asInstanceOf[js.Dynamic].applyDynamic("computeInExpansion")(filter.asInstanceOf[js.Any]).asInstanceOf[Filter]
  
  inline def getDnfTerms(filter: CompositeFilter): js.Array[Filter] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDnfTerms")(filter.asInstanceOf[js.Any]).asInstanceOf[js.Array[Filter]]
}
