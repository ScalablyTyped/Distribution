package typings
package goLib.goMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Layers are how named collections of Parts are drawn in front or behind other collections of Parts in a Diagram.
  * Layers can only contain Parts -- they cannot hold GraphObjects directly.
  */
@JSImport("go", "Layer")
@js.native
/**
  * This constructs an empty Layer; you should set the .name before adding the Layer to a Diagram.
  */
class Layer () extends js.Object {
  /**Gets or sets whether the user may copy objects in this layer.*/
  var allowCopy: scala.Boolean = js.native
  /**Gets or sets whether the user may delete objects in this layer.*/
  var allowDelete: scala.Boolean = js.native
  /**Gets or sets whether the user may group parts together in this layer.*/
  var allowGroup: scala.Boolean = js.native
  /**Gets or sets whether the user may draw new links in this layer.*/
  var allowLink: scala.Boolean = js.native
  /**Gets or sets whether the user may move objects in this layer.*/
  var allowMove: scala.Boolean = js.native
  /**Gets or sets whether the user may reconnect existing links in this layer.*/
  var allowRelink: scala.Boolean = js.native
  /**Gets or sets whether the user may reshape parts in this layer.*/
  var allowReshape: scala.Boolean = js.native
  /**Gets or sets whether the user may resize parts in this layer.*/
  var allowResize: scala.Boolean = js.native
  /**Gets or sets whether the user may rotate parts in this layer.*/
  var allowRotate: scala.Boolean = js.native
  /**Gets or sets whether the user may select objects in this layer.*/
  var allowSelect: scala.Boolean = js.native
  /**Gets or sets whether the user may do in-place text editing in this layer.*/
  var allowTextEdit: scala.Boolean = js.native
  /**Gets or sets whether the user may ungroup existing groups in this layer.*/
  var allowUngroup: scala.Boolean = js.native
  /**This read-only property returns the Diagram that is using this Layer.*/
  var diagram: Diagram = js.native
  /**Gets or sets whether the objects in this layer are considered temporary.*/
  var isTemporary: scala.Boolean = js.native
  /**Gets or sets the name for this layer.*/
  var name: java.lang.String = js.native
  /**Gets or sets the opacity for all parts in this layer.*/
  var opacity: scala.Double = js.native
  /**This read-only property returns an iterator for this Layer's Parts.*/
  var parts: Iterator[Part] = js.native
  /**This read-only property returns a backwards iterator for this Layer's Parts, for iterating over the parts in reverse order.*/
  var partsBackwards: Iterator[Part] = js.native
  /**Gets or sets whether methods such as .findObjectAt find any of the objects in this layer.*/
  var pickable: scala.Boolean = js.native
  /**Gets or sets whether the user may view any of the objects in this layer.*/
  var visible: scala.Boolean = js.native
  /**
    * Find the front-most GraphObject in this layer at the given point in document coordinates.
    * @param {Point} p A Point in document coordinates.
    * @param {function(GraphObject):GraphObject | null=} navig A function taking a GraphObject and
    * returning a GraphObject, defaulting to the identity.
    * @param {function(GraphObject):boolean | null=} pred A function taking the GraphObject
    * returned by navig and returning true if that object should be returned,
    * defaulting to a predicate that always returns true.
    */
  def findObjectAt(p: Point): GraphObject = js.native
  def findObjectAt(p: Point, navig: js.Function1[/* obj */ GraphObject, GraphObject]): GraphObject = js.native
  def findObjectAt(
    p: Point,
    navig: js.Function1[/* obj */ GraphObject, GraphObject],
    pred: js.Function1[/* obj */ GraphObject, scala.Boolean]
  ): GraphObject = js.native
  def findObjectsAt(p: Point): Set[GraphObject] = js.native
  def findObjectsAt(p: Point, navig: js.Function1[/* obj */ GraphObject, GraphObject]): Set[GraphObject] = js.native
  def findObjectsAt(
    p: Point,
    navig: js.Function1[/* obj */ GraphObject, GraphObject],
    pred: js.Function1[/* obj */ GraphObject, scala.Boolean]
  ): Set[GraphObject] = js.native
  def findObjectsAt(
    p: Point,
    navig: js.Function1[/* obj */ GraphObject, GraphObject],
    pred: js.Function1[/* obj */ GraphObject, scala.Boolean],
    coll: List[GraphObject]
  ): List[GraphObject] = js.native
  def findObjectsAt(
    p: Point,
    navig: js.Function1[/* obj */ GraphObject, GraphObject],
    pred: js.Function1[/* obj */ GraphObject, scala.Boolean],
    coll: Set[GraphObject]
  ): Set[GraphObject] = js.native
  /**
    * Return a collection of the GraphObjects of this layer at the given point in document coordinates.
    * @param {Point} p A Point in document coordinates.
    * @param {function(GraphObject):GraphObject | null=} navig A function taking a GraphObject and
    * returning a GraphObject, defaulting to the identity.
    * If this function returns null, the given GraphObject will not be included in the results.
    * @param {function(GraphObject):boolean | null=} pred A function taking the GraphObject
    * returned by navig and returning true if that object should be returned,
    * defaulting to a predicate that always returns true.
    * @param {List|Set=} coll An optional collection (List or Set) to add the results to.
    */
  @JSName("findObjectsAt")
  def findObjectsAt_List(p: Point): List[GraphObject] = js.native
  @JSName("findObjectsAt")
  def findObjectsAt_List(p: Point, navig: js.Function1[/* obj */ GraphObject, GraphObject]): List[GraphObject] = js.native
  @JSName("findObjectsAt")
  def findObjectsAt_List(
    p: Point,
    navig: js.Function1[/* obj */ GraphObject, GraphObject],
    pred: js.Function1[/* obj */ GraphObject, scala.Boolean]
  ): List[GraphObject] = js.native
  def findObjectsIn(r: Rect): Set[GraphObject] = js.native
  def findObjectsIn(r: Rect, navig: js.Function1[/* obj */ GraphObject, GraphObject]): Set[GraphObject] = js.native
  def findObjectsIn(
    r: Rect,
    navig: js.Function1[/* obj */ GraphObject, GraphObject],
    pred: js.Function1[/* obj */ GraphObject, scala.Boolean]
  ): Set[GraphObject] = js.native
  def findObjectsIn(
    r: Rect,
    navig: js.Function1[/* obj */ GraphObject, GraphObject],
    pred: js.Function1[/* obj */ GraphObject, scala.Boolean],
    partialInclusion: scala.Boolean
  ): Set[GraphObject] = js.native
  def findObjectsIn(
    r: Rect,
    navig: js.Function1[/* obj */ GraphObject, GraphObject],
    pred: js.Function1[/* obj */ GraphObject, scala.Boolean],
    partialInclusion: scala.Boolean,
    coll: List[GraphObject]
  ): List[GraphObject] = js.native
  def findObjectsIn(
    r: Rect,
    navig: js.Function1[/* obj */ GraphObject, GraphObject],
    pred: js.Function1[/* obj */ GraphObject, scala.Boolean],
    partialInclusion: scala.Boolean,
    coll: Set[GraphObject]
  ): Set[GraphObject] = js.native
  /**
    * Returns a collection of all GraphObjects that are inside or that intersect a given Rect in document coordinates.
    * @param {Rect} r A Rect in document coordinates.
    * @param {function(GraphObject):GraphObject | null=} navig A function taking a GraphObject and
    * returning a GraphObject, defaulting to the identity.
    * If this function returns null, the given GraphObject will not be included in the results.
    * @param {function(GraphObject):boolean | null=} pred A function taking the GraphObject
    * returned by navig and returning true if that object should be returned,
    * defaulting to a predicate that always returns true.
    * @param {boolean=} partialInclusion Whether an object can match if it merely intersects the rectangular area (true) or
    * if it must be entirely inside the rectangular area (false).  The default value is false.
    * @param {List|Set=} coll An optional collection (List or Set) to add the results to.
    */
  @JSName("findObjectsIn")
  def findObjectsIn_List(r: Rect): List[GraphObject] = js.native
  @JSName("findObjectsIn")
  def findObjectsIn_List(r: Rect, navig: js.Function1[/* obj */ GraphObject, GraphObject]): List[GraphObject] = js.native
  @JSName("findObjectsIn")
  def findObjectsIn_List(
    r: Rect,
    navig: js.Function1[/* obj */ GraphObject, GraphObject],
    pred: js.Function1[/* obj */ GraphObject, scala.Boolean]
  ): List[GraphObject] = js.native
  @JSName("findObjectsIn")
  def findObjectsIn_List(
    r: Rect,
    navig: js.Function1[/* obj */ GraphObject, GraphObject],
    pred: js.Function1[/* obj */ GraphObject, scala.Boolean],
    partialInclusion: scala.Boolean
  ): List[GraphObject] = js.native
  def findObjectsNear(p: Point, dist: scala.Double): Set[GraphObject] = js.native
  def findObjectsNear(p: Point, dist: scala.Double, navig: js.Function1[/* obj */ GraphObject, GraphObject]): Set[GraphObject] = js.native
  def findObjectsNear(
    p: Point,
    dist: scala.Double,
    navig: js.Function1[/* obj */ GraphObject, GraphObject],
    pred: js.Function1[/* obj */ GraphObject, scala.Boolean]
  ): Set[GraphObject] = js.native
  def findObjectsNear(
    p: Point,
    dist: scala.Double,
    navig: js.Function1[/* obj */ GraphObject, GraphObject],
    pred: js.Function1[/* obj */ GraphObject, scala.Boolean],
    partialInclusion: scala.Boolean
  ): Set[GraphObject] = js.native
  def findObjectsNear(
    p: Point,
    dist: scala.Double,
    navig: js.Function1[/* obj */ GraphObject, GraphObject],
    pred: js.Function1[/* obj */ GraphObject, scala.Boolean],
    partialInclusion: scala.Boolean,
    coll: List[GraphObject]
  ): List[GraphObject] = js.native
  def findObjectsNear(
    p: Point,
    dist: scala.Double,
    navig: js.Function1[/* obj */ GraphObject, GraphObject],
    pred: js.Function1[/* obj */ GraphObject, scala.Boolean],
    partialInclusion: scala.Boolean,
    coll: Set[GraphObject]
  ): Set[GraphObject] = js.native
  /**
    * Returns a collection of all GraphObjects that are within a certain distance of a given point in document coordinates.
    * @param {Point} p A Point in document coordinates.
    * @param {number} dist The distance from the point.
    * @param {function(GraphObject):GraphObject | null=} navig A function taking a GraphObject and
    * returning a GraphObject, defaulting to the identity.
    * If this function returns null, the given GraphObject will not be included in the results.
    * @param {function(GraphObject):boolean | null=} pred A function taking the GraphObject
    * returned by navig and returning true if that object should be returned,
    * defaulting to a predicate that always returns true.
    * @param {boolean=} partialInclusion Whether an object can match if it merely intersects the circular area (true) or
    * if it must be entirely inside the circular area (false).  The default value is true.
    * @param {List|Set=} coll An optional collection (List or Set) to add the results to.
    */
  @JSName("findObjectsNear")
  def findObjectsNear_List(p: Point, dist: scala.Double): List[GraphObject] = js.native
  @JSName("findObjectsNear")
  def findObjectsNear_List(p: Point, dist: scala.Double, navig: js.Function1[/* obj */ GraphObject, GraphObject]): List[GraphObject] = js.native
  @JSName("findObjectsNear")
  def findObjectsNear_List(
    p: Point,
    dist: scala.Double,
    navig: js.Function1[/* obj */ GraphObject, GraphObject],
    pred: js.Function1[/* obj */ GraphObject, scala.Boolean]
  ): List[GraphObject] = js.native
  @JSName("findObjectsNear")
  def findObjectsNear_List(
    p: Point,
    dist: scala.Double,
    navig: js.Function1[/* obj */ GraphObject, GraphObject],
    pred: js.Function1[/* obj */ GraphObject, scala.Boolean],
    partialInclusion: scala.Boolean
  ): List[GraphObject] = js.native
}

