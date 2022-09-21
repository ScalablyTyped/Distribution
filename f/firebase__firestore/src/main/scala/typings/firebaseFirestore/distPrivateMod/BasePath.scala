package typings.firebaseFirestore.distPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Path represents an ordered sequence of string segments.
  */
@js.native
trait BasePath[B /* <: BasePath[B] */] extends StObject {
  
  def child(nameOrPath: B): B = js.native
  def child(nameOrPath: String): B = js.native
  
  /**
    * Abstract constructor method to construct an instance of B with the given
    * parameters.
    */
  /* protected */ def construct(segments: js.Array[String]): B = js.native
  /* protected */ def construct(segments: js.Array[String], offset: Double): B = js.native
  /* protected */ def construct(segments: js.Array[String], offset: Double, length: Double): B = js.native
  /* protected */ def construct(segments: js.Array[String], offset: Unit, length: Double): B = js.native
  
  def firstSegment(): String = js.native
  
  def forEach(fn: js.Function1[/* segment */ String, Unit]): Unit = js.native
  
  def get(index: Double): String = js.native
  
  def isEmpty(): Boolean = js.native
  
  def isEqual(other: B): Boolean = js.native
  
  def isImmediateParentOf(potentialChild: this.type): Boolean = js.native
  
  def isPrefixOf(other: this.type): Boolean = js.native
  
  def lastSegment(): String = js.native
  
  /* private */ var len: Any = js.native
  
  def length: Double = js.native
  
  /** The index of one past the last segment of the path. */
  /* private */ var limit: Any = js.native
  
  /* private */ var offset: Any = js.native
  
  def popFirst(): B = js.native
  def popFirst(size: Double): B = js.native
  
  def popLast(): B = js.native
  
  /* private */ var segments: Any = js.native
  
  def toArray(): js.Array[String] = js.native
}
