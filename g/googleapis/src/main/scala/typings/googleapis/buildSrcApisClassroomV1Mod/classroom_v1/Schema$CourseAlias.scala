package typings.googleapis.buildSrcApisClassroomV1Mod.classroom_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
trait Schema$CourseAlias extends js.Object {
  /**
    * Alias string. The format of the string indicates the desired alias
    * scoping.  * `d:&lt;name&gt;` indicates a domain-scoped alias.   Example:
    * `d:math_101` * `p:&lt;name&gt;` indicates a project-scoped alias.
    * Example: `p:abc123`  This field has a maximum length of 256 characters.
    */
  var alias: js.UndefOr[String] = js.native
}

object Schema$CourseAlias {
  @scala.inline
  def apply(alias: String = null): Schema$CourseAlias = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CourseAlias]
  }
}

