package typings.firebaseFirestore

import typings.firebaseFirestore.distLiteFirestoreSrcModelDocumentMod.Document
import typings.firebaseFirestore.distLiteFirestoreSrcModelPathMod.FieldPath
import typings.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.Value
import typings.firebaseFirestore.firebaseFirestoreStrings.EqualssignEqualssign
import typings.firebaseFirestore.firebaseFirestoreStrings.ExclamationmarkEqualssign
import typings.firebaseFirestore.firebaseFirestoreStrings.Greaterthansign
import typings.firebaseFirestore.firebaseFirestoreStrings.GreaterthansignEqualssign
import typings.firebaseFirestore.firebaseFirestoreStrings.Lessthansign
import typings.firebaseFirestore.firebaseFirestoreStrings.LessthansignEqualssign
import typings.firebaseFirestore.firebaseFirestoreStrings.`array-contains-any`
import typings.firebaseFirestore.firebaseFirestoreStrings.`array-contains`
import typings.firebaseFirestore.firebaseFirestoreStrings.`not-in`
import typings.firebaseFirestore.firebaseFirestoreStrings.and_
import typings.firebaseFirestore.firebaseFirestoreStrings.in_
import typings.firebaseFirestore.firebaseFirestoreStrings.or_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLiteFirestoreSrcCoreFilterMod {
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/core/filter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/core/filter", "ArrayContainsAnyFilter")
  @js.native
  open class ArrayContainsAnyFilter protected () extends FieldFilter {
    def this(field: FieldPath, value: Value) = this()
  }
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/core/filter", "ArrayContainsFilter")
  @js.native
  open class ArrayContainsFilter protected () extends FieldFilter {
    def this(field: FieldPath, value: Value) = this()
  }
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/core/filter", "CompositeFilter")
  @js.native
  open class CompositeFilter protected () extends Filter {
    /* protected */ def this(filters: js.Array[Filter], op: CompositeOperator) = this()
    
    val filters: js.Array[Filter] = js.native
    
    /* private */ var findFirstMatchingFilter: Any = js.native
    
    /* private */ var memoizedFlattenedFilters: Any = js.native
    
    val op: CompositeOperator = js.native
  }
  /* static members */
  object CompositeFilter {
    
    @JSImport("@firebase/firestore/dist/lite/firestore/src/core/filter", "CompositeFilter")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a filter based on the provided arguments.
      */
    inline def create(filters: js.Array[Filter], op: CompositeOperator): CompositeFilter = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(filters.asInstanceOf[js.Any], op.asInstanceOf[js.Any])).asInstanceOf[CompositeFilter]
  }
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/core/filter", "FieldFilter")
  @js.native
  open class FieldFilter protected () extends Filter {
    /* protected */ def this(field: FieldPath, op: Operator, value: Value) = this()
    
    val field: FieldPath = js.native
    
    def isInequality(): Boolean = js.native
    
    /* protected */ def matchesComparison(comparison: Double): Boolean = js.native
    
    val op: Operator = js.native
    
    val value: Value = js.native
  }
  /* static members */
  object FieldFilter {
    
    @JSImport("@firebase/firestore/dist/lite/firestore/src/core/filter", "FieldFilter")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a filter based on the provided arguments.
      */
    inline def create(field: FieldPath, op: Operator, value: Value): FieldFilter = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(field.asInstanceOf[js.Any], op.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[FieldFilter]
    
    @JSImport("@firebase/firestore/dist/lite/firestore/src/core/filter", "FieldFilter.createKeyFieldInFilter")
    @js.native
    def createKeyFieldInFilter: Any = js.native
    inline def createKeyFieldInFilter_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createKeyFieldInFilter")(x.asInstanceOf[js.Any])
  }
  
  /* note: abstract class */ @JSImport("@firebase/firestore/dist/lite/firestore/src/core/filter", "Filter")
  @js.native
  open class Filter () extends StObject {
    
    def getFilters(): js.Array[Filter] = js.native
    
    def getFirstInequalityField(): FieldPath | Null = js.native
    
    def getFlattenedFilters(): js.Array[FieldFilter] = js.native
    
    def matches(doc: Document): Boolean = js.native
  }
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/core/filter", "InFilter")
  @js.native
  open class InFilter protected () extends FieldFilter {
    def this(field: FieldPath, value: Value) = this()
  }
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/core/filter", "KeyFieldFilter")
  @js.native
  open class KeyFieldFilter protected () extends FieldFilter {
    def this(field: FieldPath, op: Operator, value: Value) = this()
    
    /* private */ val key: Any = js.native
  }
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/core/filter", "KeyFieldInFilter")
  @js.native
  open class KeyFieldInFilter protected () extends FieldFilter {
    def this(field: FieldPath, value: Value) = this()
    
    /* private */ val keys: Any = js.native
  }
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/core/filter", "KeyFieldNotInFilter")
  @js.native
  open class KeyFieldNotInFilter protected () extends FieldFilter {
    def this(field: FieldPath, value: Value) = this()
    
    /* private */ val keys: Any = js.native
  }
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/core/filter", "NotInFilter")
  @js.native
  open class NotInFilter protected () extends FieldFilter {
    def this(field: FieldPath, value: Value) = this()
  }
  
  inline def canonifyFilter(filter: Filter): String = ^.asInstanceOf[js.Dynamic].applyDynamic("canonifyFilter")(filter.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def compositeFilterEquals(f1: CompositeFilter, f2: Filter): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compositeFilterEquals")(f1.asInstanceOf[js.Any], f2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def compositeFilterIsConjunction(compositeFilter: CompositeFilter): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("compositeFilterIsConjunction")(compositeFilter.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def compositeFilterIsDisjunction(compositeFilter: CompositeFilter): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("compositeFilterIsDisjunction")(compositeFilter.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def compositeFilterIsFlat(compositeFilter: CompositeFilter): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("compositeFilterIsFlat")(compositeFilter.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def compositeFilterIsFlatConjunction(compositeFilter: CompositeFilter): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("compositeFilterIsFlatConjunction")(compositeFilter.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def compositeFilterWithAddedFilters(compositeFilter: CompositeFilter, otherFilters: js.Array[Filter]): CompositeFilter = (^.asInstanceOf[js.Dynamic].applyDynamic("compositeFilterWithAddedFilters")(compositeFilter.asInstanceOf[js.Any], otherFilters.asInstanceOf[js.Any])).asInstanceOf[CompositeFilter]
  
  inline def fieldFilterEquals(f1: FieldFilter, f2: Filter): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("fieldFilterEquals")(f1.asInstanceOf[js.Any], f2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def filterEquals(f1: Filter, f2: Filter): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("filterEquals")(f1.asInstanceOf[js.Any], f2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def stringifyCompositeFilter(filter: CompositeFilter): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringifyCompositeFilter")(filter.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def stringifyFieldFilter(filter: FieldFilter): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringifyFieldFilter")(filter.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def stringifyFilter(filter: Filter): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringifyFilter")(filter.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseFirestore.firebaseFirestoreStrings.or_
    - typings.firebaseFirestore.firebaseFirestoreStrings.and_
  */
  trait CompositeOperator extends StObject
  object CompositeOperator {
    
    inline def AND: and_ = "and".asInstanceOf[and_]
    
    inline def OR: or_ = "or".asInstanceOf[or_]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseFirestore.firebaseFirestoreStrings.Lessthansign
    - typings.firebaseFirestore.firebaseFirestoreStrings.LessthansignEqualssign
    - typings.firebaseFirestore.firebaseFirestoreStrings.EqualssignEqualssign
    - typings.firebaseFirestore.firebaseFirestoreStrings.ExclamationmarkEqualssign
    - typings.firebaseFirestore.firebaseFirestoreStrings.Greaterthansign
    - typings.firebaseFirestore.firebaseFirestoreStrings.GreaterthansignEqualssign
    - typings.firebaseFirestore.firebaseFirestoreStrings.`array-contains`
    - typings.firebaseFirestore.firebaseFirestoreStrings.in_
    - typings.firebaseFirestore.firebaseFirestoreStrings.`not-in`
    - typings.firebaseFirestore.firebaseFirestoreStrings.`array-contains-any`
  */
  trait Operator extends StObject
  object Operator {
    
    inline def ARRAY_CONTAINS: `array-contains` = "array-contains".asInstanceOf[`array-contains`]
    
    inline def ARRAY_CONTAINS_ANY: `array-contains-any` = "array-contains-any".asInstanceOf[`array-contains-any`]
    
    inline def EQUAL: EqualssignEqualssign = "==".asInstanceOf[EqualssignEqualssign]
    
    inline def GREATER_THAN: Greaterthansign = ">".asInstanceOf[Greaterthansign]
    
    inline def GREATER_THAN_OR_EQUAL: GreaterthansignEqualssign = ">=".asInstanceOf[GreaterthansignEqualssign]
    
    inline def IN: in_ = "in".asInstanceOf[in_]
    
    inline def LESS_THAN: Lessthansign = "<".asInstanceOf[Lessthansign]
    
    inline def LESS_THAN_OR_EQUAL: LessthansignEqualssign = "<=".asInstanceOf[LessthansignEqualssign]
    
    inline def NOT_EQUAL: ExclamationmarkEqualssign = "!=".asInstanceOf[ExclamationmarkEqualssign]
    
    inline def NOT_IN: `not-in` = "not-in".asInstanceOf[`not-in`]
  }
}
