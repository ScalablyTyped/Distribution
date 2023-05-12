package typings.firebaseFirestore

import typings.firebaseFirestore.distLitePackagesFirestoreSrcModelPathMod.FieldPath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLitePackagesFirestoreSrcCoreAggregateMod {
  
  @JSImport("@firebase/firestore/dist/lite/packages/firestore/src/core/aggregate", "AggregateImpl")
  @js.native
  open class AggregateImpl protected ()
    extends StObject
       with Aggregate {
    def this(alias: String, aggregateType: AggregateType) = this()
    def this(alias: String, aggregateType: AggregateType, fieldPath: FieldPath) = this()
    
    /* CompleteClass */
    override val aggregateType: AggregateType = js.native
    
    /* CompleteClass */
    override val alias: String = js.native
  }
  
  trait Aggregate extends StObject {
    
    val aggregateType: AggregateType
    
    val alias: String
    
    val fieldPath: js.UndefOr[FieldPath] = js.undefined
  }
  object Aggregate {
    
    inline def apply(aggregateType: AggregateType, alias: String): Aggregate = {
      val __obj = js.Dynamic.literal(aggregateType = aggregateType.asInstanceOf[js.Any], alias = alias.asInstanceOf[js.Any])
      __obj.asInstanceOf[Aggregate]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Aggregate] (val x: Self) extends AnyVal {
      
      inline def setAggregateType(value: AggregateType): Self = StObject.set(x, "aggregateType", value.asInstanceOf[js.Any])
      
      inline def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
      
      inline def setFieldPath(value: FieldPath): Self = StObject.set(x, "fieldPath", value.asInstanceOf[js.Any])
      
      inline def setFieldPathUndefined: Self = StObject.set(x, "fieldPath", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseFirestore.firebaseFirestoreStrings.count
    - typings.firebaseFirestore.firebaseFirestoreStrings.avg
    - typings.firebaseFirestore.firebaseFirestoreStrings.sum
  */
  trait AggregateType extends StObject
  object AggregateType {
    
    inline def avg: typings.firebaseFirestore.firebaseFirestoreStrings.avg = "avg".asInstanceOf[typings.firebaseFirestore.firebaseFirestoreStrings.avg]
    
    inline def count: typings.firebaseFirestore.firebaseFirestoreStrings.count = "count".asInstanceOf[typings.firebaseFirestore.firebaseFirestoreStrings.count]
    
    inline def sum: typings.firebaseFirestore.firebaseFirestoreStrings.sum = "sum".asInstanceOf[typings.firebaseFirestore.firebaseFirestoreStrings.sum]
  }
}
