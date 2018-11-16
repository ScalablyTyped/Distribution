package typings
package gitlabLib.modelsGroupsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/Models/Groups", "Groups")
@js.native
class Groups ()
  extends gitlabLib.basemodelMod.BaseModel {
  val access_levels: IAccessLevels = js.native
  def addMember(
    groupId: scala.Double,
    userId: scala.Double,
    accessLevel: /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentLibrarySimple(gitlab), TsIdentModule(None,List(gitlab, Models, Groups)), TsIdentSimple(IAccessLevels))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentLibrarySimple(gitlab), TsIdentModule(None,List(gitlab, Models, Groups)), TsIdentSimple(IAccessLevels))),List())))) */js.Any
  ): js.Any = js.native
  def addMember(
    groupId: scala.Double,
    userId: scala.Double,
    accessLevel: /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentLibrarySimple(gitlab), TsIdentModule(None,List(gitlab, Models, Groups)), TsIdentSimple(IAccessLevels))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentLibrarySimple(gitlab), TsIdentModule(None,List(gitlab, Models, Groups)), TsIdentSimple(IAccessLevels))),List())))) */js.Any,
    fn: js.Function
  ): js.Any = js.native
  def addProject(groupId: scala.Double, projectId: scala.Double): js.Any = js.native
  def addProject(groupId: scala.Double, projectId: scala.Double, fn: js.Function): js.Any = js.native
  def all(): js.Any = js.native
  def all(fn: js.Function): js.Any = js.native
  def all(params: gitlabLib.basemodelMod.DefParams): js.Any = js.native
  def all(params: gitlabLib.basemodelMod.DefParams, fn: js.Function): js.Any = js.native
  def create(): js.Any = js.native
  def create(params: js.Object): js.Any = js.native
  def create(params: js.Object, fn: js.Function): js.Any = js.native
  def deleteGroup(groupId: scala.Double): js.Any = js.native
  def deleteGroup(groupId: scala.Double, fn: js.Function): js.Any = js.native
  def editMember(
    groupId: scala.Double,
    userId: scala.Double,
    accessLevel: /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentLibrarySimple(gitlab), TsIdentModule(None,List(gitlab, Models, Groups)), TsIdentSimple(IAccessLevels))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentLibrarySimple(gitlab), TsIdentModule(None,List(gitlab, Models, Groups)), TsIdentSimple(IAccessLevels))),List())))) */js.Any
  ): js.Any = js.native
  def editMember(
    groupId: scala.Double,
    userId: scala.Double,
    accessLevel: /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentLibrarySimple(gitlab), TsIdentModule(None,List(gitlab, Models, Groups)), TsIdentSimple(IAccessLevels))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentLibrarySimple(gitlab), TsIdentModule(None,List(gitlab, Models, Groups)), TsIdentSimple(IAccessLevels))),List())))) */js.Any,
    fn: js.Function
  ): js.Any = js.native
  def init(): js.Object = js.native
  def listMembers(groupId: scala.Double): js.Any = js.native
  def listMembers(groupId: scala.Double, fn: js.Function): js.Any = js.native
  def listProjects(groupId: scala.Double): js.Any = js.native
  def listProjects(groupId: scala.Double, fn: js.Function): js.Any = js.native
  def removeMember(groupId: scala.Double, userId: scala.Double): js.Any = js.native
  def removeMember(groupId: scala.Double, userId: scala.Double, fn: js.Function): js.Any = js.native
  def search(nameOrPath: java.lang.String): js.Any = js.native
  def search(nameOrPath: java.lang.String, fn: js.Function): js.Any = js.native
  def show(groupId: scala.Double): js.Any = js.native
  def show(groupId: scala.Double, fn: js.Function): js.Any = js.native
}

