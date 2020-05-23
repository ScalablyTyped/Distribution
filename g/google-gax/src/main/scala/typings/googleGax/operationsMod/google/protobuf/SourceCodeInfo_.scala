package typings.googleGax.operationsMod.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.operationsMod.google.protobuf.SourceCodeInfo.ILocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a SourceCodeInfo. */
@JSImport("google-gax/build/protos/operations", "google.protobuf.SourceCodeInfo")
@js.native
/**
  * Constructs a new SourceCodeInfo.
  * @param [properties] Properties to set
  */
class SourceCodeInfo_ () extends ISourceCodeInfo {
  def this(properties: ISourceCodeInfo) = this()
  /** SourceCodeInfo location. */
  @JSName("location")
  var location_SourceCodeInfo_ : js.Array[ILocation] = js.native
  /**
    * Converts this SourceCodeInfo to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

