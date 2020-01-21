package typings.dojo.dijit._editor

import typings.std.HTMLElement
import typings.std.RegExp
import typings.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/_editor/range.html
  *
  * W3C range API
  * 
  */
trait range_ extends js.Object {
  /**
    * 
    */
  var BlockTagNames: RegExp
  /**
    * 
    */
  var ie: js.Object
  /**
    * 
    */
  def W3CRange(): Unit
  /**
    * 
    * @param startnode             
    * @param next             
    */
  def adjacentNoneTextNode(startnode: js.Any, next: js.Any): js.Array[_]
  /**
    * 
    * @param container             
    * @param node             
    * @param offset             
    */
  def atBeginningOfContainer(container: HTMLElement, node: HTMLElement, offset: Double): Boolean
  /**
    * 
    * @param container             
    * @param node             
    * @param offset             
    */
  def atEndOfContainer(container: HTMLElement, node: HTMLElement, offset: Double): Boolean
  /**
    * 
    * @param win               Optional            
    */
  def create(win: Window_): js.Any
  /**
    * 
    * @param node             
    * @param regex               Optional            
    * @param root               Optional            
    */
  def getAncestor(node: HTMLElement, regex: RegExp, root: HTMLElement): HTMLElement
  /**
    * 
    * @param node             
    * @param regex               Optional            
    * @param root               Optional            
    */
  def getBlockAncestor(node: HTMLElement, regex: RegExp, root: HTMLElement): js.Object
  /**
    * 
    * @param n1             
    * @param n2             
    * @param root             
    */
  def getCommonAncestor(n1: js.Any, n2: js.Any, root: js.Any): js.Any
  /**
    * 
    * @param node             
    * @param parent             
    */
  def getIndex(node: HTMLElement, parent: HTMLElement): js.Object
  /**
    * 
    * @param index             
    * @param parent             
    */
  def getNode(index: js.Array[_], parent: HTMLElement): HTMLElement
  /**
    * 
    * @param window             
    * @param ignoreUpdate               Optional            
    */
  def getSelection(window: Window_, ignoreUpdate: Boolean): js.Any
}

object range_ {
  @scala.inline
  def apply(
    BlockTagNames: RegExp,
    W3CRange: () => Unit,
    adjacentNoneTextNode: (js.Any, js.Any) => js.Array[_],
    atBeginningOfContainer: (HTMLElement, HTMLElement, Double) => Boolean,
    atEndOfContainer: (HTMLElement, HTMLElement, Double) => Boolean,
    create: Window_ => js.Any,
    getAncestor: (HTMLElement, RegExp, HTMLElement) => HTMLElement,
    getBlockAncestor: (HTMLElement, RegExp, HTMLElement) => js.Object,
    getCommonAncestor: (js.Any, js.Any, js.Any) => js.Any,
    getIndex: (HTMLElement, HTMLElement) => js.Object,
    getNode: (js.Array[_], HTMLElement) => HTMLElement,
    getSelection: (Window_, Boolean) => js.Any,
    ie: js.Object
  ): range_ = {
    val __obj = js.Dynamic.literal(BlockTagNames = BlockTagNames.asInstanceOf[js.Any], W3CRange = js.Any.fromFunction0(W3CRange), adjacentNoneTextNode = js.Any.fromFunction2(adjacentNoneTextNode), atBeginningOfContainer = js.Any.fromFunction3(atBeginningOfContainer), atEndOfContainer = js.Any.fromFunction3(atEndOfContainer), create = js.Any.fromFunction1(create), getAncestor = js.Any.fromFunction3(getAncestor), getBlockAncestor = js.Any.fromFunction3(getBlockAncestor), getCommonAncestor = js.Any.fromFunction3(getCommonAncestor), getIndex = js.Any.fromFunction2(getIndex), getNode = js.Any.fromFunction2(getNode), getSelection = js.Any.fromFunction2(getSelection), ie = ie.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[range_]
  }
}

