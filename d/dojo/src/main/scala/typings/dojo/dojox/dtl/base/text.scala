package typings.dojo.dojox.dtl.base

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/dtl/_base.text.html
  *
  *
  */
trait text extends js.Object {
  /**
    *
    * @param name
    * @param errorless
    */
  def getFilter(name: js.Any, errorless: js.Any): js.Any
  /**
    *
    * @param name
    * @param errorless
    */
  def getTag(name: js.Any, errorless: js.Any): js.Any
  /**
    *
    * @param file
    */
  def getTemplate(file: js.Any): js.Any
  /**
    *
    * @param file
    */
  def getTemplateString(file: js.Any): String
  /**
    *
    * @param str
    */
  def tokenize(str: js.Any): js.Any
}

object text {
  @scala.inline
  def apply(
    getFilter: (js.Any, js.Any) => js.Any,
    getTag: (js.Any, js.Any) => js.Any,
    getTemplate: js.Any => js.Any,
    getTemplateString: js.Any => String,
    tokenize: js.Any => js.Any
  ): text = {
    val __obj = js.Dynamic.literal(getFilter = js.Any.fromFunction2(getFilter), getTag = js.Any.fromFunction2(getTag), getTemplate = js.Any.fromFunction1(getTemplate), getTemplateString = js.Any.fromFunction1(getTemplateString), tokenize = js.Any.fromFunction1(tokenize))
    __obj.asInstanceOf[text]
  }
}

