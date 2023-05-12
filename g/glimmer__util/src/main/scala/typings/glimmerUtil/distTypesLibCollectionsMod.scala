package typings.glimmerUtil

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesLibCollectionsMod {
  
  @JSImport("@glimmer/util/dist/types/lib/collections", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Stack<T> * / any */ @JSImport("@glimmer/util/dist/types/lib/collections", "StackImpl")
  @js.native
  open class StackImpl[T] () extends StObject {
    def this(values: js.Array[T]) = this()
    
    var current: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Option<T> */ Any = js.native
    
    def isEmpty(): Boolean = js.native
    
    def nth(from: Double): Any = js.native
    
    def pop(): Any = js.native
    
    def push(item: T): Unit = js.native
    
    def size: Double = js.native
    
    /* private */ var stack: Any = js.native
    
    def toArray(): js.Array[T] = js.native
  }
  
  inline def dict[T](): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("dict")().asInstanceOf[Any]
  
  inline def isDict[T](u: T): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDict")(u.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isObject[T](u: T): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(u.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
