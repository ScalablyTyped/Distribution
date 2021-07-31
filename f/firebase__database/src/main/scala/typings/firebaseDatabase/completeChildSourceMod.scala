package typings.firebaseDatabase

import typings.firebaseDatabase.indexMod.Index
import typings.firebaseDatabase.nodeMod.NamedNode
import typings.firebaseDatabase.nodeMod.Node
import typings.firebaseDatabase.viewCacheMod.ViewCache
import typings.firebaseDatabase.writeTreeMod.WriteTreeRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object completeChildSourceMod {
  
  @JSImport("@firebase/database/dist/src/core/view/CompleteChildSource", "NO_COMPLETE_CHILD_SOURCE")
  @js.native
  val NO_COMPLETE_CHILD_SOURCE: NoCompleteChildSource = js.native
  
  @JSImport("@firebase/database/dist/src/core/view/CompleteChildSource", "NoCompleteChildSource_")
  @js.native
  class NoCompleteChildSource ()
    extends StObject
       with CompleteChildSource {
    
    /**
      * @inheritDoc
      */
    def getChildAfterChild(): NamedNode | Null = js.native
    def getChildAfterChild(index: Unit, child: Unit, reverse: Boolean): NamedNode | Null = js.native
    def getChildAfterChild(index: Unit, child: NamedNode): NamedNode | Null = js.native
    def getChildAfterChild(index: Unit, child: NamedNode, reverse: Boolean): NamedNode | Null = js.native
    def getChildAfterChild(index: Index): NamedNode | Null = js.native
    def getChildAfterChild(index: Index, child: Unit, reverse: Boolean): NamedNode | Null = js.native
    def getChildAfterChild(index: Index, child: NamedNode): NamedNode | Null = js.native
    /**
      * @param {!Index} index
      * @param {!NamedNode} child
      * @param {boolean} reverse
      * @return {?NamedNode}
      */
    /* CompleteClass */
    override def getChildAfterChild(index: Index, child: NamedNode, reverse: Boolean): NamedNode | Null = js.native
    
    /**
      * @inheritDoc
      */
    def getCompleteChild(): Node | Null = js.native
    /**
      * @param {!string} childKey
      * @return {?Node}
      */
    /* CompleteClass */
    override def getCompleteChild(childKey: String): Node | Null = js.native
  }
  
  @JSImport("@firebase/database/dist/src/core/view/CompleteChildSource", "WriteTreeCompleteChildSource")
  @js.native
  class WriteTreeCompleteChildSource protected ()
    extends StObject
       with CompleteChildSource {
    /**
      * @param {!WriteTreeRef} writes_
      * @param {!ViewCache} viewCache_
      * @param {?Node} optCompleteServerCache_
      */
    def this(writes_ : WriteTreeRef, viewCache_ : ViewCache) = this()
    def this(writes_ : WriteTreeRef, viewCache_ : ViewCache, optCompleteServerCache_ : Node) = this()
    
    /**
      * @param {!Index} index
      * @param {!NamedNode} child
      * @param {boolean} reverse
      * @return {?NamedNode}
      */
    /* CompleteClass */
    override def getChildAfterChild(index: Index, child: NamedNode, reverse: Boolean): NamedNode | Null = js.native
    
    /**
      * @param {!string} childKey
      * @return {?Node}
      */
    /* CompleteClass */
    override def getCompleteChild(childKey: String): Node | Null = js.native
    
    var optCompleteServerCache_ : js.Any = js.native
    
    var viewCache_ : js.Any = js.native
    
    var writes_ : js.Any = js.native
  }
  
  trait CompleteChildSource extends StObject {
    
    /**
      * @param {!Index} index
      * @param {!NamedNode} child
      * @param {boolean} reverse
      * @return {?NamedNode}
      */
    def getChildAfterChild(index: Index, child: NamedNode, reverse: Boolean): NamedNode | Null
    
    /**
      * @param {!string} childKey
      * @return {?Node}
      */
    def getCompleteChild(childKey: String): Node | Null
  }
  object CompleteChildSource {
    
    @scala.inline
    def apply(
      getChildAfterChild: (Index, NamedNode, Boolean) => NamedNode | Null,
      getCompleteChild: String => Node | Null
    ): CompleteChildSource = {
      val __obj = js.Dynamic.literal(getChildAfterChild = js.Any.fromFunction3(getChildAfterChild), getCompleteChild = js.Any.fromFunction1(getCompleteChild))
      __obj.asInstanceOf[CompleteChildSource]
    }
    
    @scala.inline
    implicit class CompleteChildSourceMutableBuilder[Self <: CompleteChildSource] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetChildAfterChild(value: (Index, NamedNode, Boolean) => NamedNode | Null): Self = StObject.set(x, "getChildAfterChild", js.Any.fromFunction3(value))
      
      @scala.inline
      def setGetCompleteChild(value: String => Node | Null): Self = StObject.set(x, "getCompleteChild", js.Any.fromFunction1(value))
    }
  }
}
