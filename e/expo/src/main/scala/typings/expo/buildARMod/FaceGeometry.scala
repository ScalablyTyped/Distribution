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
    val __obj = js.Dynamic.literal(textureCoordinateCount = textureCoordinateCount.asInstanceOf[js.Any], textureCoordinates = textureCoordinates.asInstanceOf[js.Any], triangleCount = triangleCount.asInstanceOf[js.Any], triangleIndices = triangleIndices.asInstanceOf[js.Any], vertexCount = vertexCount.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FaceGeometry]
  }
}

