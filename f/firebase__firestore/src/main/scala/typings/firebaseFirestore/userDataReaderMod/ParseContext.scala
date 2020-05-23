package typings.firebaseFirestore.userDataReaderMod

import typings.firebaseFirestore.anon.PartialContextSettings
import typings.firebaseFirestore.databaseInfoMod.DatabaseId
import typings.firebaseFirestore.mutationMod.FieldTransform
import typings.firebaseFirestore.pathMod.FieldPath
import typings.firebaseFirestore.serializerMod.JsonProtoSerializer
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/packages/firestore/src/api/user_data_reader", "ParseContext")
@js.native
class ParseContext protected () extends js.Object {
  /**
    * Initializes a ParseContext with the given source and path.
    *
    * @param settings The settings for the parser.
    * @param databaseId The database ID of the Firestore instance.
    * @param serializer The serializer to use to generate the Value proto.
    * @param fieldTransforms A mutable list of field transforms encountered while
    *     parsing the data.
    * @param fieldMask A mutable list of field paths encountered while parsing
    *     the data.
    *
    * TODO(b/34871131): We don't support array paths right now, so path can be
    * null to indicate the context represents any location within an array (in
    * which case certain features will not work and errors will be somewhat
    * compromised).
    */
  def this(settings: ContextSettings, databaseId: DatabaseId, serializer: JsonProtoSerializer) = this()
  def this(
    settings: ContextSettings,
    databaseId: DatabaseId,
    serializer: JsonProtoSerializer,
    fieldTransforms: js.Array[FieldTransform]
  ) = this()
  def this(
    settings: ContextSettings,
    databaseId: DatabaseId,
    serializer: JsonProtoSerializer,
    fieldTransforms: js.Array[FieldTransform],
    fieldMask: js.Array[FieldPath]
  ) = this()
  val databaseId: DatabaseId = js.native
  val fieldMask: js.Array[FieldPath] = js.native
  val fieldTransforms: js.Array[FieldTransform] = js.native
  val serializer: JsonProtoSerializer = js.native
  val settings: ContextSettings = js.native
  var validatePath: js.Any = js.native
  var validatePathSegment: js.Any = js.native
  def childContextForArray(index: Double): ParseContext = js.native
  def childContextForField(field: String): ParseContext = js.native
  def childContextForFieldPath(field: FieldPath): ParseContext = js.native
  /** Returns 'true' if 'fieldPath' was traversed when creating this context. */
  def contains(fieldPath: FieldPath): Boolean = js.native
  /** Returns a new context with the specified settings overwritten. */
  def contextWith(configuration: PartialContextSettings): ParseContext = js.native
  def createError(reason: String): Error = js.native
  def dataSource: UserDataSource = js.native
  def path: js.UndefOr[FieldPath] = js.native
}

