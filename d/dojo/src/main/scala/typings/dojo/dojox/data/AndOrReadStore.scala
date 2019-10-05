package typings.dojo.dojox.data

import typings.dojo.dojo.data.ItemFileReadStore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/data/AndOrReadStore.html
  *
  * AndOrReadStore uses ItemFileReadStore as a base, modifying only the query (_fetchItems) section.
  * Supports queries of the form: query:"id:1 OR dept:'Sales Department' || (id:2 && NOT dept:S*)"
  * Includes legacy/widget support via:
  *
  * query:{complexQuery:"id:1* OR dept:'Sales Department' || (id:2* && NOT dept:S*)"}
  * The ItemFileReadStore implements the dojo/data/api/Read API and reads
  *
  * data from JSON files that have contents in this format --
  *
  * { items: [
  *     { name:'Kermit', color:'green', age:12, friends:['Gonzo', {_reference:{name:'Fozzie Bear'}}]},
  *     { name:'Fozzie Bear', wears:['hat', 'tie']},
  *     { name:'Miss Piggy', pets:'Foo-Foo'}
  * ]}
  * Note that it can also contain an 'identifier' property that specified which attribute on the items
  *
  * in the array of items that acts as the unique identifier for that item.
  *
  * @param keywordParameters {url: String} {data: jsonObject} {typeMap: object}The structure of the typeMap object is as follows:{    type0: function || object,    type1: function || object,    ...    typeN: function || object}Where if it is a function, it is assumed to be an object constructor that takes thevalue of _value as the initialization parameters.  If it is an object, then it is assumedto be an object of general form:{    type: function, //constructor.    deserialize:    function(value) //The function that parses the value and constructs the object defined by type appropriately.}
  */
@JSGlobal("dojox.data.AndOrReadStore")
@js.native
class AndOrReadStore protected () extends ItemFileReadStore {
  def this(keywordParameters: js.Object) = this()
  /**
    *
    * @param requestArgs
    * @param arrayOfItems
    * @param findCallback
    */
  def filter(requestArgs: js.Any, arrayOfItems: js.Any, findCallback: js.Any): Unit = js.native
}

