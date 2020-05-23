package typings.domhandler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomHandlerOptions extends js.Object {
  /***
    * Indicates whether the whitespace in text nodes should be normalized
    * (= all whitespace should be replaced with single spaces). The default value is "false".
    */
  var normalizeWhitespace: js.UndefOr[Boolean] = js.undefined
  /***
    * Adds DOM level 1 properties to all elements.
    */
  var withDomLvl1: js.UndefOr[Boolean] = js.undefined
  /***
    * Indicates whether a endIndex property will be added to nodes.
    * When the parser is used in a non-streaming fashion, endIndex is an integer
    * indicating the position of the end of the node in the document.
    * The default value is "false".
    */
  var withEndIndices: js.UndefOr[Boolean] = js.undefined
  /***
    * Indicates whether a startIndex property will be added to nodes.
    * When the parser is used in a non-streaming fashion, startIndex is an integer
    * indicating the position of the start of the node in the document.
    * The default value is "false".
    */
  var withStartIndices: js.UndefOr[Boolean] = js.undefined
}

object DomHandlerOptions {
  @scala.inline
  def apply(
    normalizeWhitespace: js.UndefOr[Boolean] = js.undefined,
    withDomLvl1: js.UndefOr[Boolean] = js.undefined,
    withEndIndices: js.UndefOr[Boolean] = js.undefined,
    withStartIndices: js.UndefOr[Boolean] = js.undefined
  ): DomHandlerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(normalizeWhitespace)) __obj.updateDynamic("normalizeWhitespace")(normalizeWhitespace.get.asInstanceOf[js.Any])
    if (!js.isUndefined(withDomLvl1)) __obj.updateDynamic("withDomLvl1")(withDomLvl1.get.asInstanceOf[js.Any])
    if (!js.isUndefined(withEndIndices)) __obj.updateDynamic("withEndIndices")(withEndIndices.get.asInstanceOf[js.Any])
    if (!js.isUndefined(withStartIndices)) __obj.updateDynamic("withStartIndices")(withStartIndices.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomHandlerOptions]
  }
}

