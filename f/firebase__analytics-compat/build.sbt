organization := "org.scalablytyped"
name := "firebase__analytics-compat"
version := "0.2.6-3acc13"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "firebase__analytics" % "0.10.0-8308b7",
  "org.scalablytyped" %%% "firebase__analytics-types" % "0.8.0-96aee6",
  "org.scalablytyped" %%% "firebase__app" % "0.9.9-e8225c",
  "org.scalablytyped" %%% "firebase__app-compat" % "0.2.9-a0f799",
  "org.scalablytyped" %%% "firebase__app-types" % "0.9.0-8ac2f2",
  "org.scalablytyped" %%% "firebase__component" % "0.6.4-b93592",
  "org.scalablytyped" %%% "firebase__logger" % "0.4.0-5ce190",
  "org.scalablytyped" %%% "firebase__util" % "1.9.3-ed4cef",
  "org.scalablytyped" %%% "std" % "5.0-e63739",
  "org.scalablytyped" %%% "trusted-types" % "2.0-dt-20230214Z-8c8094")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
