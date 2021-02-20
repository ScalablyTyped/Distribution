package typings.googleapis.classroomV1Mod.classroomV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Alternative identifier for a course.  An alias uniquely identifies a
  * course. It must be unique within one of the following scopes:  * domain: A
  * domain-scoped alias is visible to all users within the alias creator&#39;s
  * domain and can be created only by a domain admin. A domain-scoped alias is
  * often used when a course has an identifier external to Classroom.  *
  * project: A project-scoped alias is visible to any request from an
  * application using the Developer Console project ID that created the alias
  * and can be created by any project. A project-scoped alias is often used
  * when an application has alternative identifiers. A random value can also be
  * used to avoid duplicate courses in the event of transmission failures, as
  * retrying a request will return `ALREADY_EXISTS` if a previous one has
  * succeeded.
  */
@js.native
trait SchemaCourseAlias extends StObject {
  
  /**
    * Alias string. The format of the string indicates the desired alias
    * scoping.  * `d:&lt;name&gt;` indicates a domain-scoped alias.   Example:
    * `d:math_101` * `p:&lt;name&gt;` indicates a project-scoped alias.
    * Example: `p:abc123`  This field has a maximum length of 256 characters.
    */
  var alias: js.UndefOr[String] = js.native
}
object SchemaCourseAlias {
  
  @scala.inline
  def apply(): SchemaCourseAlias = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCourseAlias]
  }
  
  @scala.inline
  implicit class SchemaCourseAliasMutableBuilder[Self <: SchemaCourseAlias] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
  }
}
