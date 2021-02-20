package typings.go.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * GraphLinksModels support links between nodes and grouping nodes and links into subgraphs.
  * GraphLinksModels hold node data and link data in separate arrays.
  * Node data is normally represented in a Diagram by instances of Node,
  * but they could be represented by simple Parts or by Groups.
  * Link data should be represented by instances of Link.
  */
@JSImport("go", "GraphLinksModel")
@js.native
/**
  * This constructs an empty GraphLinksModel unless one provides arguments as the initial data array values for the Model.nodeDataArray and GraphLinksModel.linkDataArray properties.
  * @param {Array<Object>=} nodedataarray an optional Array containing JavaScript objects to be represented by Nodes.
  * @param {Array<Object>=} linkdataarray an optional Array containing JavaScript objects to be represented by Links.
  */
class GraphLinksModel () extends Model {
  def this(nodedataarray: js.Array[js.Object]) = this()
  def this(nodedataarray: js.UndefOr[scala.Nothing], linkdataarray: js.Array[js.Object]) = this()
  def this(nodedataarray: js.Array[js.Object], linkdataarray: js.Array[js.Object]) = this()
  
  /**
    * Adds a node key value that identifies a node data acting as a new label node on the given link data.
    * This method only works if .linkLabelKeysProperty has been set to something other than an empty string.
    * @param {Object} linkdata a JavaScript object representing a link.
    * @param {string|number} key a number or string that is the key of the new label node.
    */
  def addLabelKeyForLinkData(linkdata: js.Object, key: Key): Unit = js.native
  
  /**
    * When you want to add a link to the diagram, call this method with a new data object.
    * This will add that data to the .linkDataArray and
    * notify all listeners that a new link data object has been inserted into the collection.
    * Presumably the link data object will already have its "from" and "to" node key references set,
    * but it is also possible to set them after the link data is in the model
    * by calling .setFromKeyForLinkData and .setToKeyForLinkData.
    * This operation does nothing if the link data is already part of this model's .linkDataArray.
    * @param {Object} linkdata a JavaScript object representing a link.
    */
  def addLinkData(linkdata: js.Object): Unit = js.native
  
  def addLinkDataCollection(coll: js.Array[js.Object]): Unit = js.native
  /**
    * Add to this model all of the link data held in an Array or in an Iterable of link data objects.
    * @param {Iterable<Object>|Array<Object>} coll a collection of link data objects to add to the .linkDataArray
    */
  def addLinkDataCollection(coll: Iterable[js.Object]): Unit = js.native
  
  /**
    * Gets or sets a data object that will be copied and added to the model as a new node data each time there
    * is a link reference (either the "to" or the "from" of a link data) to a node key that does not yet exist in the model.
    * The default value is null -- node data is not automatically copied and added to the model
    * when there is an unresolved reference in a link data.
    * The value must be an Object or null.
    * When adding or modifying a link data if there is a "from" or "to" key value for which Model.findNodeDataForKey returns null,
    * it will call Model.copyNodeData on this property value and Model.addNodeData on the result.
    */
  var archetypeNodeData: js.Any = js.native
  
  /**
    * Decide if a given link data is in this model.
    * @param {Object} linkdata a JavaScript object representing a link.
    */
  def containsLinkData(linkdata: js.Object): Boolean = js.native
  
  /**
    * Make a copy of a link data object.
    * This uses the value of .copyLinkDataFunction to actually perform the copy,
    * unless it is null, in which case this method just makes a shallow copy of the JavaScript Object.
    * This does not modify the model -- the returned data object is not added to this model.
    * This assumes that the data's constructor can be called with no arguments.
    * This also makes sure there is no reference to either the "from" or the "to" node of the original data.
    * @param {Object} linkdata a JavaScript object representing a link.
    */
  def copyLinkData(linkdata: js.Object): js.Object = js.native
  
  /**
    * Gets or sets a function that makes a copy of a link data object.
    * You may need to set this property in order to ensure that a copied Link is bound
    * to data that does not share certain data structures between the original link data and the copied link data.
    * The value may be null in order to cause .copyLinkData to make a shallow copy of a JavaScript Object.
    * The default value is null.
    */
  def copyLinkDataFunction(obj: js.Object, model: GraphLinksModel): js.Object = js.native
  
  /**
    * Given a number or string, find the link data object in this model
    * that uses the given value as its unique key.
    * Unless .linkKeyProperty is set to a non-empty string, this model
    * will not automatically assign unique key values for link data objects,
    * and thus this method will always return null.
    * The return value will be an Object or null.
    * @param {*} key a string or a number.
    */
  def findLinkDataForKey(key: Key): js.Any = js.native
  
  /**
    * Find the category of a given link data, a string naming the link template
    * that the Diagram should use to represent the link data.
    * @param {Object} linkdata a JavaScript object representing a link.
    */
  def getCategoryForLinkData(linkdata: js.Object): String = js.native
  
  /**
    * From a link data retrieve a value uniquely identifying the node data
    * from which this link is connected.
    * @param {Object} linkdata a JavaScript object representing a link.
    */
  def getFromKeyForLinkData(linkdata: js.Object): Key = js.native
  
  /**
    * From a link data retrieve a value identifying the port object of the node
    * from which this link is connected.
    * @param {Object} linkdata a JavaScript object representing a link.
    */
  def getFromPortIdForLinkData(linkdata: js.Object): String = js.native
  
  /**
    * If there is a container group for the given node data, return the group's key.
    * @param {Object} nodedata a JavaScript object representing a node, group, or non-link.
    */
  def getGroupKeyForNodeData(nodedata: js.Object): Key = js.native
  
  /**
    * Given a link data object return its unique key: a number or a string.
    * This returns undefined if there is no key value.
    * Unless .linkKeyProperty is set to a non-empty string, this model
    * will not automatically assign unique key values for link data objects.
    * It is possible to change the key for a link data object by calling .setKeyForLinkData.
    * @param {Object} linkdata a JavaScript object representing a link.
    */
  def getKeyForLinkData(linkdata: js.Object): Key = js.native
  
  /**
    * Gets an Array of node key values that identify node data acting as labels on the given link data.
    * This method only works if .linkLabelKeysProperty has been set to something other than an empty string.
    * @param {Object} linkdata a JavaScript object representing a link.
    */
  def getLabelKeysForLinkData(linkdata: js.Object): js.Array[Key] = js.native
  
  /**
    * From a link data retrieve a value uniquely identifying the node data
    * to which this link is connected.
    * @param {Object} linkdata a JavaScript object representing a link.
    */
  def getToKeyForLinkData(linkdata: js.Object): Key = js.native
  
  /**
    * From a link data retrieve a value identifying the port object of the node
    * to which this link is connected.
    * @param {Object} linkdata a JavaScript object representing a link.
    */
  def getToPortIdForLinkData(linkdata: js.Object): String = js.native
  
  /**
    * See if the given node data should be represented as a group or as a simple node.
    * This value must not change as long as the node data is part of the model.
    * At the current time there is no <code>setIsGroupForNodeData</code> method.
    * @param {Object} nodedata a JavaScript object representing a node, group, or non-link.
    */
  def isGroupForNodeData(nodedata: js.Object): Boolean = js.native
  
  /**
    * Gets or sets the name of the data property that returns a string naming that data's category,
    * or a function that takes a link data object and returns that category string;
    * the default value is the name 'category'.
    * This is used by the diagram to distinguish between different kinds of links.
    * The name must not be null.
    */
  var linkCategoryProperty: PropertyAccessor = js.native
  
  /**Gets or sets the array of link data objects that correspond to Links in the Diagram; the initial value is an empty Array.*/
  var linkDataArray: js.Array[js.Object] = js.native
  
  /**
    * Gets or sets the name of the data property that returns
    * the key of the node data that the link data is coming from,
    * or a function that takes a link data object and returns that key;
    * the default value is the name 'from'.
    * The name must not be null.
    * If the value is an empty string,
    * .getFromKeyForLinkData will return undefined for all link data objects.
    */
  var linkFromKeyProperty: PropertyAccessor = js.native
  
  /**
    * Gets or sets the name of the data property that returns the optional parameter naming a "port" element on the node that the link data is connected from,
    * or a function that takes a link data object and returns that string.
    * The default value is the empty string indicating that one cannot distinguish
    * different logical connection points for any links.
    * The name must not be null.
    */
  var linkFromPortIdProperty: PropertyAccessor = js.native
  
  /**Gets or sets the name of the data property that returns a unique id number or string for each link data object, or a function taking a link data object and returning the key value; the default value is '', which causes the model NOT to assign unique identifiers automatically.*/
  var linkKeyProperty: PropertyAccessor = js.native
  
  /**
    * Gets or sets the name of the data property that returns
    * an array of keys of node data that are labels on that link data,
    * or a function that takes a link data object and returns such an array;
    * the default value is the empty string: ''.
    * The name must not be null.
    * If the value is an empty string,
    * .getLabelKeysForLinkData will return an empty array for all link data objects.
    * You will need to set this property in order to support nodes as link labels.
    */
  var linkLabelKeysProperty: PropertyAccessor = js.native
  
  /**
    * Gets or sets the name of the data property that returns
    * the key of the node data that the link data is going to,
    * or a function that takes a link data object and returns that key;
    * the default value is the name 'to'.
    * The name must not be null.
    */
  var linkToKeyProperty: PropertyAccessor = js.native
  
  /**
    * Gets or sets the name of the data property that returns
    * the optional parameter naming a "port" element on the node that the link data is connected to,
    * or a function that takes a link data object and returns that string.
    * The default value is the empty string indicating that one cannot distinguish
    * different logical connection points for any links.
    * The name must not be null.
    */
  var linkToPortIdProperty: PropertyAccessor = js.native
  
  /**
    * This method is called when a link data object is added to the model to make sure that
    * .getKeyForLinkData returns a unique key value.
    * The key value should be unique within the set of data managed by this model:
    * .linkDataArray.
    * If the key is already in use, this will assign an unused number to the
    * .linkKeyProperty property on the data.
    * If you want to customize the way in which link data gets a unique key,
    * you can set the .makeUniqueKeyFunction functional property.
    * If the link data object is already in the model and you want to change its key value,
    * call .setKeyForLinkData and give it a new unique key value.
    * @param {Object} linkdata a JavaScript object representing a link.
    */
  def makeLinkDataKeyUnique(linkdata: js.Object): Unit = js.native
  
  /**Gets or sets a function that returns a unique id number or string for a link data object; the default value is null.*/
  def makeUniqueLinkKeyFunction(model: Model, obj: js.Object): Key = js.native
  
  /**
    * Gets or sets the name of the property on node data that specifies
    * the string or number key of the group data that "owns" that node data,
    * or a function that takes a node data object and returns that group key.
    * the default value is the name 'group'.
    * The value must not be null.
    */
  var nodeGroupKeyProperty: PropertyAccessor = js.native
  
  /**
    * Gets or sets the name of the boolean property on node data that indicates
    * whether the data should be represented as a group of nodes and links or
    * as a simple node,
    * or a function that takes a node data object and returns true or false;
    * the default value is the name 'isGroup'.
    * The value must not be null.
    */
  var nodeIsGroupProperty: PropertyAccessor = js.native
  
  /**
    * Removes a node key value that identifies a node data acting as a former label node on the given link data.
    * Removing a reference to a node data from the collection of link label keys
    * does not automatically remove any node data from the model.
    * This method only works if .linkLabelKeysProperty has been set to something other than an empty string.
    * @param {Object} linkdata a JavaScript object representing a link.
    * @param {string|number} key a number or string that is the key of the label node being removed from the link.
    */
  def removeLabelKeyForLinkData(linkdata: js.Object, key: Key): Unit = js.native
  
  /**
    * When you want to remove a link from the diagram, call this method with an existing link data object.
    * This will remove that data from the .linkDataArray and
    * notify all listeners that a link data object has been removed from the collection.
    * Removing a link data from a model does not automatically remove
    * any associated label node data from the model.
    * This operation does nothing if the link data is not present in the .linkDataArray.
    * @param {Object} linkdata a JavaScript object representing a link.
    */
  def removeLinkData(linkdata: js.Object): Unit = js.native
  
  def removeLinkDataCollection(coll: js.Array[js.Object]): Unit = js.native
  /**
    * Remove from this model all of the link data held in an Array or in an Iterable of link data objects.
    * @param {Iterable<Object>|Array<Object>} coll a collection of link data objects to remove from the .linkDataArray
    */
  def removeLinkDataCollection(coll: Iterable[js.Object]): Unit = js.native
  
  /**
    * Change the category of a given link data, a string naming the link template
    * that the Diagram should use to represent the link data.
    * Changing the link template for a link data will cause the existing Link
    * to be removed from the Diagram and be replaced with a new Link
    * created by copying the new link template and applying any data-bindings.
    * @param {Object} linkdata a JavaScript object representing a link.
    * @param {string} cat Must not be null.
    */
  def setCategoryForLinkData(linkdata: js.Object, cat: String): Unit = js.native
  
  /**
    * Change the node key that the given link data references as the
    * source of the link.
    * @param {Object} linkdata a JavaScript object representing a link.
    * @param {string|number|undefined} key This may be undefined if
    * the link should no longer come from any node.
    */
  def setFromKeyForLinkData(linkdata: js.Object, key: Key): Unit = js.native
  
  /**
    * Change the information that the given link data uses to identify the
    * particular "port" that the link is coming from.
    * @param {Object} linkdata a JavaScript object representing a link.
    * @param {string} portname This may be the empty string if
    * the link should no longer be associated with any particular "port".
    */
  def setFromPortIdForLinkData(linkdata: js.Object, portname: String): Unit = js.native
  
  /**
    * Change the container group for the given node data, given a key for the new group.
    * @param {Object} nodedata a JavaScript object representing a node, group, or non-link.
    * @param {string|number|undefined} key This may be undefined if there should be no containing group data.
    */
  def setGroupKeyForNodeData(nodedata: js.Object, key: Key): Unit = js.native
  
  /**
    * Change the unique key of a given link data that is already in this model.
    * The new key value must be unique -- i.e. not in use by another link data object.
    * You can call .findLinkDataForKey to check if a proposed new key is already in use.
    * If this is called when .linkKeyProperty is the empty string (i.e. its default value),
    * this method has no effect.
    * If this is called on a link data object that is not (yet) in this model,
    * this unconditionally modifies the property to the new key value.
    * @param {Object} linkdata a JavaScript object representing a link.
    * @param {string|number|undefined} key
    */
  def setKeyForLinkData(linkdata: js.Object, key: Key): Unit = js.native
  
  /**
    * Replaces an Array of node key values that identify node data acting as labels on the given link data.
    * This method only works if .linkLabelKeysProperty has been set to something other than an empty string.
    * @param {Object} linkdata a JavaScript object representing a link.
    * @param arr an Array of node keys; an empty Array if the property was not present.
    */
  def setLabelKeysForLinkData(linkdata: js.Object, arr: js.Array[Key]): Unit = js.native
  
  /**
    * Change the node key that the given link data references as the
    * destination of the link.
    * @param {Object} linkdata a JavaScript object representing a link.
    * @param {string|number|undefined} key This may be undefined if
    * the link should no longer go to any node.
    */
  def setToKeyForLinkData(linkdata: js.Object, key: Key): Unit = js.native
  
  /**
    * Change the information that the given link data uses to identify the
    * particular "port" that the link is going to.
    * @param {Object} linkdata a JavaScript object representing a link.
    * @param {string} portname This may be the empty string if
    * the link should no longer be associated with any particular "port".
    */
  def setToPortIdForLinkData(linkdata: js.Object, portname: String): Unit = js.native
}
