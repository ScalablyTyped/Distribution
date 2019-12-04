package typings.dojo.dijit._editor.range

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/_editor/range.ie.html
  *
  * 
  */
trait ie extends js.Object {
  /**
    * 
    */
  var cachedSelection: js.Object
  /**
    * 
    * @param range             
    */
  def decomposeControlRange(range: js.Any): js.Array[_]
  /**
    * 
    * @param range             
    */
  def decomposeTextRange(range: js.Any): js.Array[_]
  /**
    * 
    * @param range             
    * @param end             
    */
  def getEndPoint(range: js.Any, end: js.Any): js.Array[_]
  /**
    * 
    * @param window             
    */
  def selection(window: js.Any): Unit
  /**
    * 
    * @param range             
    * @param container             
    * @param offset             
    */
  def setEndPoint(range: js.Any, container: js.Any, offset: js.Any): js.Any
  /**
    * 
    * @param range             
    * @param startContainer             
    * @param startOffset             
    * @param endContainer             
    * @param endOffset             
    * @param collapsed             
    */
  def setRange(
    range: js.Any,
    startContainer: js.Any,
    startOffset: js.Any,
    endContainer: js.Any,
    endOffset: js.Any,
    collapsed: js.Any
  ): js.Any
}

object ie {
  @scala.inline
  def apply(
    cachedSelection: js.Object,
    decomposeControlRange: js.Any => js.Array[_],
    decomposeTextRange: js.Any => js.Array[_],
    getEndPoint: (js.Any, js.Any) => js.Array[_],
    selection: js.Any => Unit,
    setEndPoint: (js.Any, js.Any, js.Any) => js.Any,
    setRange: (js.Any, js.Any, js.Any, js.Any, js.Any, js.Any) => js.Any
  ): ie = {
    val __obj = js.Dynamic.literal(cachedSelection = cachedSelection.asInstanceOf[js.Any], decomposeControlRange = js.Any.fromFunction1(decomposeControlRange), decomposeTextRange = js.Any.fromFunction1(decomposeTextRange), getEndPoint = js.Any.fromFunction2(getEndPoint), selection = js.Any.fromFunction1(selection), setEndPoint = js.Any.fromFunction3(setEndPoint), setRange = js.Any.fromFunction6(setRange))
  
    __obj.asInstanceOf[ie]
  }
}

