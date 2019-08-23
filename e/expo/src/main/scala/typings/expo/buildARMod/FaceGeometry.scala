package typings.expo.buildARMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FaceGeometry extends js.Object {
  var textureCoordinateCount: Double
  var textureCoordinates: js.Array[TextureCoordinate]
  var triangleCount: Double
  var triangleIndices: js.Array[Double]
  var vertexCount: Double
  var vertices: js.Array[Vector3]
}

object FaceGeometry {
  @scala.inline
  def apply(
    textureCoordinateCount: Double,
    textureCoordinates: js.Array[TextureCoordinate],
    triangleCount: Double,
    triangleIndices: js.Array[Double],
    vertexCount: Double,
    vertices: js.Array[Vector3]
  ): FaceGeometry = {
    val __obj = js.Dynamic.literal(textureCoordinateCount = textureCoordinateCount, textureCoordinates = textureCoordinates, triangleCount = triangleCount, triangleIndices = triangleIndices, vertexCount = vertexCount, vertices = vertices)
  
    __obj.asInstanceOf[FaceGeometry]
  }
}

