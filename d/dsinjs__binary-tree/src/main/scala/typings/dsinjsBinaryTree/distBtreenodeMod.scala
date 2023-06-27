package typings.dsinjsBinaryTree

import org.scalablytyped.runtime.Instantiable1
import typings.std.AddEventListenerOptions
import typings.std.EventListenerOptions
import typings.std.EventListenerOrEventListenerObject
import typings.std.FrameRequestCallback
import typings.std.Storage
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBtreenodeMod {
  
  @JSImport("@dsinjs/binary-tree/dist/btreenode", "BTreeNode")
  @js.native
  open class BTreeNode[T] protected () extends StObject {
    /**
      *
      * @param {BTreeNodeStruct} attr attributes to initialize the node.
      */
    def this(attr: BTreeNodeStruct[T]) = this()
    
    /**
      * Returns depth of its children.
      * Goes in direction of L -> R
      * @public
      * @returns {number}
      * @example
      * var node = new BTreeNode({ value: 10 });
      * var lNode = new BTreeNode({ value: 15, lNode: node });
      * var l2Node = new BTreeNode({ value: 15, lNode: lNode });
      * console.log(l2Node.getDepth()); // 3
      */
    def getDepth(): Double = js.native
    
    /**
      * @property lNode
      * Contains left child node
      * @type {BTreeNode}
      * @public
      */
    var lNode: BTreeNode[T] | Null = js.native
    
    /**
      * @property rNode
      * Contains right child node
      * @type {BTreeNode}
      * @public
      */
    var rNode: BTreeNode[T] | Null = js.native
    
    /**
      * Converts current node and all children nodes in json format.
      * @public
      * @returns {BTreeNodeStruct}
      * @example
      * var node = new BTreeNode({ value: 10 });
      * var lNode = new BTreeNode({ value: 15, lNode: lNode });
      * console.log(node.toJSON()); // {value:15,lNode: {value: 10,lNode:null,rNode:null},rNode:null}
      */
    def toJSON(): BTreeNodeStruct[T] = js.native
    
    /**
      * Validates a BTree node, it must have a valid value (no undefined nor null).
      * @public
      * @returns {boolean}
      * @example
      * new BTreeNode(); // throws error saying `A BTree node must have a valid value, cannot be null or undefined`
      * var node = new BTreeNode({ value: 10 });
      * console.log(node.validate()); // true
      */
    def validate(): Boolean = js.native
    
    /**
      * @property value
      * Contains actual value
      * @type {T}
      * @public
      */
    var value: T | Null = js.native
  }
  
  @JSImport("@dsinjs/binary-tree/dist/btreenode", "BTreeNodeStruct")
  @js.native
  open class BTreeNodeStruct[T] () extends StObject {
    
    var lNode: js.UndefOr[BTreeNodeStruct[T] | Null] = js.native
    
    var rNode: js.UndefOr[BTreeNodeStruct[T] | Null] = js.native
    
    var value: js.UndefOr[T | Null] = js.native
  }
  
  @JSImport("@dsinjs/binary-tree/dist/btreenode", "ExtendedWindow")
  @js.native
  open class ExtendedWindow ()
    extends StObject
       with Window {
    
    var BTreeNode: Instantiable1[
        /* attr */ BTreeNodeStruct[/* import warning: RewrittenClass.unapply cls was tparam T */ Any], 
        typings.dsinjsBinaryTree.distBtreenodeMod.BTreeNode[js.Object]
      ] = js.native
    
    var DSinJS: typings.dsinjsBinaryTree.anon.BTreeNode = js.native
    
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
    
    /* standard dom */
    /* CompleteClass */
    override def cancelAnimationFrame(handle: Double): Unit = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/localStorage) */
    /* standard dom */
    /* CompleteClass */
    override val localStorage: Storage = js.native
    
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
    
    /* standard dom */
    /* CompleteClass */
    override def requestAnimationFrame(callback: FrameRequestCallback): Double = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/sessionStorage) */
    /* standard dom */
    /* CompleteClass */
    override val sessionStorage: Storage = js.native
  }
}
