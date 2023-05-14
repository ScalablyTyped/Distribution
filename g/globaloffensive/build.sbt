organization := "org.scalablytyped"
name := "globaloffensive"
version := "2.3-dt-20230510Z-ae0f4f"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bytebuffer" % "5.0.0-dt-20220818Z-c283df",
  "org.scalablytyped" %%% "file-manager" % "2.0-dt-20220829Z-a38893",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230513Z-b25634",
  "org.scalablytyped" %%% "std" % "5.0-e63739",
  "org.scalablytyped" %%% "steam-user" % "4.26-dt-20230510Z-ab861e",
  "org.scalablytyped" %%% "steamid" % "2.0-dt-20211202Z-2ad9ef")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
