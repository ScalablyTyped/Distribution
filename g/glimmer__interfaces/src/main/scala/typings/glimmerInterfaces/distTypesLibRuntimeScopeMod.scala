package typings.glimmerInterfaces

import typings.glimmerInterfaces.distTypesLibCoreMod.Dict
import typings.glimmerInterfaces.distTypesLibCoreMod.Option
import typings.glimmerInterfaces.distTypesLibRuntimeOwnerMod.Owner
import typings.glimmerInterfaces.distTypesLibTemplateMod.CompilableBlock
import typings.glimmerInterfaces.distTypesLibTier1SymbolTableMod.BlockSymbolTable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesLibRuntimeScopeMod {
  
  type Block = CompilableBlock | Double
  
  type BlockValue = /* import warning: importer.ImportType#apply Failed type conversion: @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/runtime/scope.ScopeBlock[0 | 1 | 2] */ js.Any
  
  trait DynamicScope extends StObject {
    
    def child(): DynamicScope
    
    def get(key: String): Any
    
    def set(
      key: String,
      reference: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Reference<unknown> */ Any
    ): Any
  }
  object DynamicScope {
    
    inline def apply(
      child: () => DynamicScope,
      get: String => Any,
      set: (String, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Reference<unknown> */ Any) => Any
    ): DynamicScope = {
      val __obj = js.Dynamic.literal(child = js.Any.fromFunction0(child), get = js.Any.fromFunction1(get), set = js.Any.fromFunction2(set))
      __obj.asInstanceOf[DynamicScope]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DynamicScope] (val x: Self) extends AnyVal {
      
      inline def setChild(value: () => DynamicScope): Self = StObject.set(x, "child", js.Any.fromFunction0(value))
      
      inline def setGet(value: String => Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setSet(
        value: (String, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Reference<unknown> */ Any) => Any
      ): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    }
  }
  
  trait PartialScope
    extends StObject
       with Scope
  object PartialScope {
    
    inline def apply(
      bind: (Double, ScopeSlot) => Unit,
      bindBlock: (Double, Option[ScopeBlock]) => Unit,
      bindEvalScope: Option[Dict[ScopeSlot]] => Unit,
      bindPartialMap: Dict[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Reference */ Any
        ] => Unit,
      bindSelf: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Reference */ Any => Unit,
      bindSymbol: (Double, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Reference */ Any) => Unit,
      child: () => Scope,
      getBlock: Double => Option[ScopeBlock],
      getEvalScope: () => Option[Dict[ScopeSlot]],
      getPartialMap: () => Option[
          Dict[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Reference */ Any
          ]
        ],
      getSelf: () => Any,
      getSymbol: Double => Any,
      owner: Owner,
      slots: js.Array[ScopeSlot]
    ): PartialScope = {
      val __obj = js.Dynamic.literal(bind = js.Any.fromFunction2(bind), bindBlock = js.Any.fromFunction2(bindBlock), bindEvalScope = js.Any.fromFunction1(bindEvalScope), bindPartialMap = js.Any.fromFunction1(bindPartialMap), bindSelf = js.Any.fromFunction1(bindSelf), bindSymbol = js.Any.fromFunction2(bindSymbol), child = js.Any.fromFunction0(child), getBlock = js.Any.fromFunction1(getBlock), getEvalScope = js.Any.fromFunction0(getEvalScope), getPartialMap = js.Any.fromFunction0(getPartialMap), getSelf = js.Any.fromFunction0(getSelf), getSymbol = js.Any.fromFunction1(getSymbol), owner = owner.asInstanceOf[js.Any], slots = slots.asInstanceOf[js.Any])
      __obj.asInstanceOf[PartialScope]
    }
  }
  
  trait Scope extends StObject {
    
    def bind(symbol: Double, value: ScopeSlot): Unit
    
    def bindBlock(symbol: Double, value: Option[ScopeBlock]): Unit
    
    def bindEvalScope(map: Option[Dict[ScopeSlot]]): Unit
    
    def bindPartialMap(
      map: Dict[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Reference */ Any
        ]
    ): Unit
    
    def bindSelf(
      self: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Reference */ Any
    ): Unit
    
    def bindSymbol(
      symbol: Double,
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Reference */ Any
    ): Unit
    
    def child(): Scope
    
    def getBlock(symbol: Double): Option[ScopeBlock]
    
    def getEvalScope(): Option[Dict[ScopeSlot]]
    
    def getPartialMap(): Option[
        Dict[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Reference */ Any
        ]
      ]
    
    def getSelf(): Any
    
    def getSymbol(symbol: Double): Any
    
    val owner: Owner
    
    // for debug only
    val slots: js.Array[ScopeSlot]
  }
  object Scope {
    
    inline def apply(
      bind: (Double, ScopeSlot) => Unit,
      bindBlock: (Double, Option[ScopeBlock]) => Unit,
      bindEvalScope: Option[Dict[ScopeSlot]] => Unit,
      bindPartialMap: Dict[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Reference */ Any
        ] => Unit,
      bindSelf: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Reference */ Any => Unit,
      bindSymbol: (Double, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Reference */ Any) => Unit,
      child: () => Scope,
      getBlock: Double => Option[ScopeBlock],
      getEvalScope: () => Option[Dict[ScopeSlot]],
      getPartialMap: () => Option[
          Dict[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Reference */ Any
          ]
        ],
      getSelf: () => Any,
      getSymbol: Double => Any,
      owner: Owner,
      slots: js.Array[ScopeSlot]
    ): Scope = {
      val __obj = js.Dynamic.literal(bind = js.Any.fromFunction2(bind), bindBlock = js.Any.fromFunction2(bindBlock), bindEvalScope = js.Any.fromFunction1(bindEvalScope), bindPartialMap = js.Any.fromFunction1(bindPartialMap), bindSelf = js.Any.fromFunction1(bindSelf), bindSymbol = js.Any.fromFunction2(bindSymbol), child = js.Any.fromFunction0(child), getBlock = js.Any.fromFunction1(getBlock), getEvalScope = js.Any.fromFunction0(getEvalScope), getPartialMap = js.Any.fromFunction0(getPartialMap), getSelf = js.Any.fromFunction0(getSelf), getSymbol = js.Any.fromFunction1(getSymbol), owner = owner.asInstanceOf[js.Any], slots = slots.asInstanceOf[js.Any])
      __obj.asInstanceOf[Scope]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Scope] (val x: Self) extends AnyVal {
      
      inline def setBind(value: (Double, ScopeSlot) => Unit): Self = StObject.set(x, "bind", js.Any.fromFunction2(value))
      
      inline def setBindBlock(value: (Double, Option[ScopeBlock]) => Unit): Self = StObject.set(x, "bindBlock", js.Any.fromFunction2(value))
      
      inline def setBindEvalScope(value: Option[Dict[ScopeSlot]] => Unit): Self = StObject.set(x, "bindEvalScope", js.Any.fromFunction1(value))
      
      inline def setBindPartialMap(
        value: Dict[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Reference */ Any
            ] => Unit
      ): Self = StObject.set(x, "bindPartialMap", js.Any.fromFunction1(value))
      
      inline def setBindSelf(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Reference */ Any => Unit
      ): Self = StObject.set(x, "bindSelf", js.Any.fromFunction1(value))
      
      inline def setBindSymbol(
        value: (Double, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Reference */ Any) => Unit
      ): Self = StObject.set(x, "bindSymbol", js.Any.fromFunction2(value))
      
      inline def setChild(value: () => Scope): Self = StObject.set(x, "child", js.Any.fromFunction0(value))
      
      inline def setGetBlock(value: Double => Option[ScopeBlock]): Self = StObject.set(x, "getBlock", js.Any.fromFunction1(value))
      
      inline def setGetEvalScope(value: () => Option[Dict[ScopeSlot]]): Self = StObject.set(x, "getEvalScope", js.Any.fromFunction0(value))
      
      inline def setGetPartialMap(
        value: () => Option[
              Dict[
                /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Reference */ Any
              ]
            ]
      ): Self = StObject.set(x, "getPartialMap", js.Any.fromFunction0(value))
      
      inline def setGetSelf(value: () => Any): Self = StObject.set(x, "getSelf", js.Any.fromFunction0(value))
      
      inline def setGetSymbol(value: Double => Any): Self = StObject.set(x, "getSymbol", js.Any.fromFunction1(value))
      
      inline def setOwner(value: Owner): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
      
      inline def setSlots(value: js.Array[ScopeSlot]): Self = StObject.set(x, "slots", value.asInstanceOf[js.Any])
      
      inline def setSlotsVarargs(value: ScopeSlot*): Self = StObject.set(x, "slots", js.Array(value*))
    }
  }
  
  type ScopeBlock = js.Tuple3[CompilableBlock, Scope, BlockSymbolTable]
  
  type ScopeSlot = (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Reference */ Any) | ScopeBlock | Null
}
