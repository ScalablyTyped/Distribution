package typings.gitlab.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.gitlab.baseServiceMod.BaseServiceOptions
import typings.gitlab.servicesMod.EpicNotes
import typings.gitlab.servicesMod.Epics
import typings.gitlab.servicesMod.GroupAccessRequests
import typings.gitlab.servicesMod.GroupBadges
import typings.gitlab.servicesMod.GroupCustomAttributes
import typings.gitlab.servicesMod.GroupIssueBoards
import typings.gitlab.servicesMod.GroupLabels
import typings.gitlab.servicesMod.GroupMembers
import typings.gitlab.servicesMod.GroupMilestones
import typings.gitlab.servicesMod.GroupProjects
import typings.gitlab.servicesMod.GroupVariables
import typings.gitlab.servicesMod.Groups
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EpicDiscussions extends js.Object {
  var EpicDiscussions: Instantiable1[/* options */ BaseServiceOptions, typings.gitlab.servicesMod.EpicDiscussions] = js.native
  var EpicIssues: Instantiable0[typings.gitlab.servicesMod.EpicIssues] = js.native
  var EpicNotes: Instantiable1[/* options */ BaseServiceOptions, typings.gitlab.servicesMod.EpicNotes] = js.native
  var Epics: Instantiable0[typings.gitlab.servicesMod.Epics] = js.native
  var GroupAccessRequests: Instantiable1[/* options */ BaseServiceOptions, typings.gitlab.servicesMod.GroupAccessRequests] = js.native
  var GroupBadges: Instantiable1[/* options */ BaseServiceOptions, typings.gitlab.servicesMod.GroupBadges] = js.native
  var GroupCustomAttributes: Instantiable1[/* options */ BaseServiceOptions, typings.gitlab.servicesMod.GroupCustomAttributes] = js.native
  var GroupIssueBoards: Instantiable1[/* options */ BaseServiceOptions, typings.gitlab.servicesMod.GroupIssueBoards] = js.native
  var GroupLabels: Instantiable1[/* options */ BaseServiceOptions, typings.gitlab.servicesMod.GroupLabels] = js.native
  var GroupMembers: Instantiable1[/* options */ BaseServiceOptions, typings.gitlab.servicesMod.GroupMembers] = js.native
  var GroupMilestones: Instantiable1[/* options */ BaseServiceOptions, typings.gitlab.servicesMod.GroupMilestones] = js.native
  var GroupProjects: Instantiable0[typings.gitlab.servicesMod.GroupProjects] = js.native
  var GroupVariables: Instantiable1[/* options */ BaseServiceOptions, typings.gitlab.servicesMod.GroupVariables] = js.native
  var Groups: Instantiable0[typings.gitlab.servicesMod.Groups] = js.native
}

object EpicDiscussions {
  @scala.inline
  def apply(
    EpicDiscussions: Instantiable1[/* options */ BaseServiceOptions, typings.gitlab.servicesMod.EpicDiscussions],
    EpicIssues: Instantiable0[typings.gitlab.servicesMod.EpicIssues],
    EpicNotes: Instantiable1[/* options */ BaseServiceOptions, EpicNotes],
    Epics: Instantiable0[Epics],
    GroupAccessRequests: Instantiable1[/* options */ BaseServiceOptions, GroupAccessRequests],
    GroupBadges: Instantiable1[/* options */ BaseServiceOptions, GroupBadges],
    GroupCustomAttributes: Instantiable1[/* options */ BaseServiceOptions, GroupCustomAttributes],
    GroupIssueBoards: Instantiable1[/* options */ BaseServiceOptions, GroupIssueBoards],
    GroupLabels: Instantiable1[/* options */ BaseServiceOptions, GroupLabels],
    GroupMembers: Instantiable1[/* options */ BaseServiceOptions, GroupMembers],
    GroupMilestones: Instantiable1[/* options */ BaseServiceOptions, GroupMilestones],
    GroupProjects: Instantiable0[GroupProjects],
    GroupVariables: Instantiable1[/* options */ BaseServiceOptions, GroupVariables],
    Groups: Instantiable0[Groups]
  ): EpicDiscussions = {
    val __obj = js.Dynamic.literal(EpicDiscussions = EpicDiscussions.asInstanceOf[js.Any], EpicIssues = EpicIssues.asInstanceOf[js.Any], EpicNotes = EpicNotes.asInstanceOf[js.Any], Epics = Epics.asInstanceOf[js.Any], GroupAccessRequests = GroupAccessRequests.asInstanceOf[js.Any], GroupBadges = GroupBadges.asInstanceOf[js.Any], GroupCustomAttributes = GroupCustomAttributes.asInstanceOf[js.Any], GroupIssueBoards = GroupIssueBoards.asInstanceOf[js.Any], GroupLabels = GroupLabels.asInstanceOf[js.Any], GroupMembers = GroupMembers.asInstanceOf[js.Any], GroupMilestones = GroupMilestones.asInstanceOf[js.Any], GroupProjects = GroupProjects.asInstanceOf[js.Any], GroupVariables = GroupVariables.asInstanceOf[js.Any], Groups = Groups.asInstanceOf[js.Any])
    __obj.asInstanceOf[EpicDiscussions]
  }
  @scala.inline
  implicit class EpicDiscussionsOps[Self <: EpicDiscussions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEpicDiscussions(value: Instantiable1[/* options */ BaseServiceOptions, typings.gitlab.servicesMod.EpicDiscussions]): Self = this.set("EpicDiscussions", value.asInstanceOf[js.Any])
    @scala.inline
    def setEpicIssues(value: Instantiable0[typings.gitlab.servicesMod.EpicIssues]): Self = this.set("EpicIssues", value.asInstanceOf[js.Any])
    @scala.inline
    def setEpicNotes(value: Instantiable1[/* options */ BaseServiceOptions, EpicNotes]): Self = this.set("EpicNotes", value.asInstanceOf[js.Any])
    @scala.inline
    def setEpics(value: Instantiable0[Epics]): Self = this.set("Epics", value.asInstanceOf[js.Any])
    @scala.inline
    def setGroupAccessRequests(value: Instantiable1[/* options */ BaseServiceOptions, GroupAccessRequests]): Self = this.set("GroupAccessRequests", value.asInstanceOf[js.Any])
    @scala.inline
    def setGroupBadges(value: Instantiable1[/* options */ BaseServiceOptions, GroupBadges]): Self = this.set("GroupBadges", value.asInstanceOf[js.Any])
    @scala.inline
    def setGroupCustomAttributes(value: Instantiable1[/* options */ BaseServiceOptions, GroupCustomAttributes]): Self = this.set("GroupCustomAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def setGroupIssueBoards(value: Instantiable1[/* options */ BaseServiceOptions, GroupIssueBoards]): Self = this.set("GroupIssueBoards", value.asInstanceOf[js.Any])
    @scala.inline
    def setGroupLabels(value: Instantiable1[/* options */ BaseServiceOptions, GroupLabels]): Self = this.set("GroupLabels", value.asInstanceOf[js.Any])
    @scala.inline
    def setGroupMembers(value: Instantiable1[/* options */ BaseServiceOptions, GroupMembers]): Self = this.set("GroupMembers", value.asInstanceOf[js.Any])
    @scala.inline
    def setGroupMilestones(value: Instantiable1[/* options */ BaseServiceOptions, GroupMilestones]): Self = this.set("GroupMilestones", value.asInstanceOf[js.Any])
    @scala.inline
    def setGroupProjects(value: Instantiable0[GroupProjects]): Self = this.set("GroupProjects", value.asInstanceOf[js.Any])
    @scala.inline
    def setGroupVariables(value: Instantiable1[/* options */ BaseServiceOptions, GroupVariables]): Self = this.set("GroupVariables", value.asInstanceOf[js.Any])
    @scala.inline
    def setGroups(value: Instantiable0[Groups]): Self = this.set("Groups", value.asInstanceOf[js.Any])
  }
  
}

