package typings.fastEquals

import typings.fastEquals.anon.CacheMeta
import typings.fastEquals.distEsmTypesInternalTypesMod.ComparatorConfig
import typings.fastEquals.distEsmTypesInternalTypesMod.CreateState
import typings.fastEquals.distEsmTypesInternalTypesMod.CustomEqualCreatorOptions
import typings.fastEquals.distEsmTypesInternalTypesMod.EqualityComparator
import typings.fastEquals.distEsmTypesInternalTypesMod.InternalEqualityComparator
import typings.fastEquals.distEsmTypesInternalTypesMod.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmTypesComparatorMod {
  
  @JSImport("fast-equals/dist/esm/types/comparator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createEqualityComparator[Meta](param0: ComparatorConfig[Meta]): EqualityComparator[Meta] = ^.asInstanceOf[js.Dynamic].applyDynamic("createEqualityComparator")(param0.asInstanceOf[js.Any]).asInstanceOf[EqualityComparator[Meta]]
  
  inline def createEqualityComparatorConfig[Meta](param0: CustomEqualCreatorOptions[Meta]): ComparatorConfig[Meta] = ^.asInstanceOf[js.Dynamic].applyDynamic("createEqualityComparatorConfig")(param0.asInstanceOf[js.Any]).asInstanceOf[ComparatorConfig[Meta]]
  
  inline def createInternalEqualityComparator[Meta](compare: EqualityComparator[Meta]): InternalEqualityComparator[Meta] = ^.asInstanceOf[js.Dynamic].applyDynamic("createInternalEqualityComparator")(compare.asInstanceOf[js.Any]).asInstanceOf[InternalEqualityComparator[Meta]]
  
  inline def createIsEqual[Meta](param0: CreateIsEqualOptions[Meta]): js.Function2[/* a */ Any, /* b */ Any, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("createIsEqual")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* a */ Any, /* b */ Any, Boolean]]
  
  trait CreateIsEqualOptions[Meta] extends StObject {
    
    var circular: Boolean
    
    def comparator[A, B](a: A, b: B, state: State[Meta]): Boolean
    @JSName("comparator")
    var comparator_Original: EqualityComparator[Meta]
    
    var createState: js.UndefOr[CreateState[Meta]] = js.undefined
    
    def equals(a: Any, b: Any, indexOrKeyA: Any, indexOrKeyB: Any, parentA: Any, parentB: Any, state: State[Meta]): Boolean
    @JSName("equals")
    var equals_Original: InternalEqualityComparator[Meta]
    
    var strict: Boolean
  }
  object CreateIsEqualOptions {
    
    inline def apply[Meta](
      circular: Boolean,
      comparator: (/* a */ Any, /* b */ Any, /* state */ State[Meta]) => Boolean,
      equals_ : (/* a */ Any, /* b */ Any, /* indexOrKeyA */ Any, /* indexOrKeyB */ Any, /* parentA */ Any, /* parentB */ Any, /* state */ State[Meta]) => Boolean,
      strict: Boolean
    ): CreateIsEqualOptions[Meta] = {
      val __obj = js.Dynamic.literal(circular = circular.asInstanceOf[js.Any], comparator = js.Any.fromFunction3(comparator), strict = strict.asInstanceOf[js.Any])
      __obj.updateDynamic("equals")(js.Any.fromFunction7(equals_))
      __obj.asInstanceOf[CreateIsEqualOptions[Meta]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CreateIsEqualOptions[?], Meta] (val x: Self & CreateIsEqualOptions[Meta]) extends AnyVal {
      
      inline def setCircular(value: Boolean): Self = StObject.set(x, "circular", value.asInstanceOf[js.Any])
      
      inline def setComparator(value: (/* a */ Any, /* b */ Any, /* state */ State[Meta]) => Boolean): Self = StObject.set(x, "comparator", js.Any.fromFunction3(value))
      
      inline def setCreateState(value: () => CacheMeta[Meta]): Self = StObject.set(x, "createState", js.Any.fromFunction0(value))
      
      inline def setCreateStateUndefined: Self = StObject.set(x, "createState", js.undefined)
      
      inline def setEquals_(
        value: (/* a */ Any, /* b */ Any, /* indexOrKeyA */ Any, /* indexOrKeyB */ Any, /* parentA */ Any, /* parentB */ Any, /* state */ State[Meta]) => Boolean
      ): Self = StObject.set(x, "equals", js.Any.fromFunction7(value))
      
      inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    }
  }
}
