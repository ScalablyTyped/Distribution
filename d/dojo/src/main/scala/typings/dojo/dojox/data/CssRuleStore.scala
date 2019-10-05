package typings.dojo.dojox.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/data/CssRuleStore.html
  *
  * Basic store to display CSS information.
  * The CssRuleStore allows users to get information about active CSS rules in the page running the CssRuleStore.
  * It can also filter out rules from specific stylesheets.  The attributes it exposes on rules are as follows:
  *
  * selector:             The selector text.
  * classes:              An array of classes present in this selector.
  * rule:                 The actual DOM Rule object.
  * style:                    The actual DOM CSSStyleDeclaration object.
  * cssText:              The cssText string provided on the rule object.
  * styleSheet:               The originating DOM Stylesheet object.
  * parentStyleSheet:     The parent stylesheet to the sheet this rule originates from.
  * parentStyleSheetHref: The href of the parent stylesheet.
  * AND every style attribute denoted as style.*, such as style.textAlign or style.backgroundColor
  *
  * @param keywordParameters
  */
@JSGlobal("dojox.data.CssRuleStore")
@js.native
class CssRuleStore protected () extends js.Object {
  def this(keywordParameters: js.Object) = this()
  /**
    * See dojo/data/api/Read.close().
    * Clears out the cache and allItems objects, meaning all future fetches will requery
    * the stylesheets.
    *
    */
  def close(): Unit = js.native
  /**
    * See dojo/data/api/Read.containsValue()
    *
    * @param item
    * @param attribute
    * @param value
    */
  def containsValue(item: js.Any, attribute: String, value: js.Any): js.Any = js.native
  /**
    * See dojo/data/api/Read.fetch()
    *
    * @param request
    */
  def fetch(request: js.Any): String = js.native
  /**
    * See dojo/data/api/Read.getAttributes()
    *
    * @param item
    */
  def getAttributes(item: js.Any): js.Array[_] = js.native
  /**
    * See dojo/data/api/Read.getFeatures()
    *
    */
  def getFeatures(): js.Object = js.native
  /**
    * See dojo/data/api/Read.getLabel()
    *
    * @param item
    */
  def getLabel(item: js.Any): js.Any = js.native
  /**
    * See dojo/data/api/Read.getLabelAttributes()
    *
    * @param item
    */
  def getLabelAttributes(item: js.Any): js.Array[_] = js.native
  /**
    * See dojo/data/api/Read.getValue()
    *
    * @param item
    * @param attribute
    * @param defaultValue
    */
  def getValue(item: js.Any, attribute: js.Any, defaultValue: js.Any): js.Any = js.native
  /**
    * See dojo/data/api/Read.getValues()
    *
    * @param item
    * @param attribute
    */
  def getValues(item: js.Any, attribute: js.Any): js.Array[_] = js.native
  /**
    * See dojo/data/api/Read.hasAttribute()
    *
    * @param item
    * @param attribute
    */
  def hasAttribute(item: js.Any, attribute: js.Any): Boolean = js.native
  /**
    * See dojo/data/api/Read.isItem()
    *
    * @param item
    */
  def isItem(item: js.Any): Boolean = js.native
  /**
    * See dojo/data/api/Read.isItemLoaded()
    *
    * @param something
    */
  def isItemLoaded(something: js.Any): js.Any = js.native
  /**
    * See dojo/data/api/Read.loadItem()
    *
    * @param keywordArgs
    */
  def loadItem(keywordArgs: js.Object): Unit = js.native
  /**
    *
    * @param context
    */
  def setContext(context: js.Array[_]): Unit = js.native
}

