package typings.dotnetDepsParser.parsersMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ProjectJsonDepType extends js.Object

@JSImport("dotnet-deps-parser/dist/parsers", "ProjectJsonDepType")
@js.native
object ProjectJsonDepType extends js.Object {
  @js.native
  sealed trait build extends ProjectJsonDepType
  
  @js.native
  sealed trait default extends ProjectJsonDepType
  
  @js.native
  sealed trait platform extends ProjectJsonDepType
  
  @js.native
  sealed trait project extends ProjectJsonDepType
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ProjectJsonDepType with String] = js.native
  /* "build" */ @js.native
  object build extends TopLevel[build with String]
  
  /* "default" */ @js.native
  object default extends TopLevel[default with String]
  
  /* "platform" */ @js.native
  object platform extends TopLevel[platform with String]
  
  /* "project" */ @js.native
  object project extends TopLevel[project with String]
  
}

