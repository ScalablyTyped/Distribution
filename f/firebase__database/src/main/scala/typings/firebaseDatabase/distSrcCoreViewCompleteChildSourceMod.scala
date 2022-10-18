package typings.firebaseDatabase

import typings.firebaseDatabase.distSrcCoreSnapIndexesIndexMod.Index
import typings.firebaseDatabase.distSrcCoreSnapNodeMod.NamedNode
import typings.firebaseDatabase.distSrcCoreSnapNodeMod.Node
import typings.firebaseDatabase.distSrcCoreViewViewCacheMod.ViewCache
import typings.firebaseDatabase.distSrcCoreWriteTreeMod.WriteTreeRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCoreViewCompleteChildSourceMod {
  
  @JSImport("@firebase/database/dist/src/core/view/CompleteChildSource", "NO_COMPLETE_CHILD_SOURCE")
  @js.native
  val NO_COMPLETE_CHILD_SOURCE: NoCompleteChildSource = js.native
  
  @JSImport("@firebase/database/dist/src/core/view/CompleteChildSource", "NoCompleteChildSource_")
  @js.native
  open class NoCompleteChildSource ()
    extends StObject
       with CompleteChildSource {
    
    def getChildAfterChild(): NamedNode | Null = js.native
    def getChildAfterChild(index: Unit, child: Unit, reverse: Boolean): NamedNode | Null = js.native
    def getChildAfterChild(index: Unit, child: NamedNode): NamedNode | Null = js.native
    def getChildAfterChild(index: Unit, child: NamedNode, reverse: Boolean): NamedNode | Null = js.native
    def getChildAfterChild(index: Index): NamedNode | Null = js.native
    def getChildAfterChild(index: Index, child: Unit, reverse: Boolean): NamedNode | Null = js.native
    def getChildAfterChild(index: Index, child: NamedNode): NamedNode | Null = js.native
    /* CompleteClass */
    override def getChildAfterChild(index: Index, child: NamedNode, reverse: Boolean): NamedNode | Null = js.native
    
    def getCompleteChild(): Node | Null = js.native
    /* CompleteClass */
    override def getCompleteChild(childKey: String): Node | Null = js.native
  }
  
  @JSImport("@firebase/database/dist/src/core/view/CompleteChildSource", "WriteTreeCompleteChildSource")
  @js.native
  open class WriteTreeCompleteChildSource protected ()
    extends StObject
       with CompleteChildSource {
    def this(writes_ : WriteTreeRef, viewCache_ : ViewCache) = this()
    def this(writes_ : WriteTreeRef, viewCache_ : ViewCache, optCompleteServerCache_ : Node) = this()
    
    /* CompleteClass */
    override def getChildAfterChild(index: Index, child: NamedNode, reverse: Boolean): NamedNode | Null = js.native
    
    /* CompleteClass */
    override def getCompleteChild(childKey: String): Node | Null = js.native
    
    /* private */ var optCompleteServerCache_ : Any = js.native
    
    /* private */ var viewCache_ : Any = js.native
    
    /* private */ var writes_ : Any = js.native
  }
  
  trait CompleteChildSource extends StObject {
    
    def getChildAfterChild(index: Index, child: NamedNode, reverse: Boolean): NamedNode | Null
    
    def getCompleteChild(childKey: String): Node | Null
  }
  object CompleteChildSource {
    
    inline def apply(
      getChildAfterChild: (Index, NamedNode, Boolean) => NamedNode | Null,
      getCompleteChild: String => Node | Null
    ): CompleteChildSource = {
      val __obj = js.Dynamic.literal(getChildAfterChild = js.Any.fromFunction3(getChildAfterChild), getCompleteChild = js.Any.fromFunction1(getCompleteChild))
      __obj.asInstanceOf[CompleteChildSource]
    }
    
    extension [Self <: CompleteChildSource](x: Self) {
      
      inline def setGetChildAfterChild(value: (Index, NamedNode, Boolean) => NamedNode | Null): Self = StObject.set(x, "getChildAfterChild", js.Any.fromFunction3(value))
      
      inline def setGetCompleteChild(value: String => Node | Null): Self = StObject.set(x, "getCompleteChild", js.Any.fromFunction1(value))
    }
  }
}
