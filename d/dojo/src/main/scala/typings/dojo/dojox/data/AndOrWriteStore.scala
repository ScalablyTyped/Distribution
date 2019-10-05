package typings.dojo.dojox.data

import typings.dojo.dojo.data.ItemFileWriteStore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/data/AndOrWriteStore.html
  *
  *
  * @param keywordParameters The structure of the typeMap object is as follows:{    type0: function || object,    type1: function || object,    ...    typeN: function || object}Where if it is a function, it is assumed to be an object constructor that takes thevalue of _value as the initialization parameters.  It is serialized assuming object.toString()serialization.  If it is an object, then it is assumedto be an object of general form:{    type: function, //constructor.    deserialize:    function(value) //The function that parses the value and constructs the object defined by type appropriately.    serialize:  function(object) //The function that converts the object back into the proper file format form.}
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.dojo.dojo.Evented because Already inherited
- typings.dojo.dojo.data.ItemFileReadStore because Already inherited
- typings.dojo.dojox.data.AndOrReadStore because Inheritance from two classes. Inlined close, close, containsValue, emit, errorHandler, fetch, fetchHandler, fetchItemByIdentity, filter, getAttributes, getFeatures, getIdentity, getIdentityAttributes, getLabel, getLabelAttributes, getValue, getValues, hasAttribute, isItem, isItemLoaded, loadItem, on */ @JSGlobal("dojox.data.AndOrWriteStore")
@js.native
class AndOrWriteStore protected () extends ItemFileWriteStore {
  def this(keywordParameters: js.Object) = this()
  /**
    *
    * @param requestArgs
    * @param arrayOfItems
    * @param findCallback
    */
  def filter(requestArgs: js.Any, arrayOfItems: js.Any, findCallback: js.Any): Unit = js.native
}

